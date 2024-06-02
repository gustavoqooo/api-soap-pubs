package pe.edu.cibertec.api_soap_pubs.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    @Bean(name = "paises")
    public DefaultWsdl11Definition paisWsdl11Definition(XsdSchema paisSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PaisesPort");
        wsdl11Definition.setLocationUri("/ws/paises");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(paisSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema paisSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/paises.xsd"));
    }

    @Bean(name = "domicilios")
    public DefaultWsdl11Definition domicilioWsdl11Definition(XsdSchema domicilioSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("DomiciliosPort");
        wsdl11Definition.setLocationUri("/ws/domicilios");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(domicilioSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema domicilioSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/domicilio.xsd"));
    }

}
