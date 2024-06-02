package pe.edu.cibertec.api_soap_pubs.endpoint;


import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.api_soap_pubs.exception.NotFoundException;
import pe.edu.cibertec.api_soap_pubs.service.DomicilioService;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class DomicilioEndPoint {

    private DomicilioService domicilioService;
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getDomiciliosRequest")
    @ResponsePayload
    public GetDomiciliosResponse getDomicilios(@RequestPayload
                                                  GetDomiciliosRequest request){
        GetDomiciliosResponse response = new GetDomiciliosResponse();
        response.getDomicilios().addAll(domicilioService.listarDomicilios());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getDomicilioRequest")
    @ResponsePayload
    public GetDomicilioResponse getDomicilio(@RequestPayload
                                                  GetDomicilioRequest request){
        GetDomicilioResponse response = new GetDomicilioResponse();
        Domiciliows domiciliows = domicilioService.obtenerDomicilioxId(request.getId());
        if(domiciliows == null)
            throw new NotFoundException("El domicilio con el ID " + request.getId()+" no existe!");
        response.setDomicilio(domiciliows);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postDomicilioRequest")
    @ResponsePayload
    public PostDomicilioResponse saveDomicilio(@RequestPayload
                                                    PostDomicilioRequest request){
        PostDomicilioResponse response = new PostDomicilioResponse();
        response.setDomicilio(domicilioService.registrarActualizarDomicilio(
                request.getDomicilio()));
        return response;
    }


}
