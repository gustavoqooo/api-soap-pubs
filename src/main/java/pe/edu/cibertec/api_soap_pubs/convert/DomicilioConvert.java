package pe.edu.cibertec.api_soap_pubs.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.api_soap_pubs.model.Domicilio;
import pe.edu.cibertec.ws.objects.Domiciliows;

import java.util.ArrayList;
import java.util.List;

@Component
public class DomicilioConvert {

    public Domicilio convertDomiciliowsToDomicilio(Domiciliows domiciliows){
        return Domicilio.builder().iddomicilio(domiciliows.getIddomicilio())
                .descdomicilio(domiciliows.getDescdomicilio())
                .nrodomicilio(domiciliows.getNrodomicilio())
                .refdomicilio(domiciliows.getRefdomicilio()).build();
    }

    public List<Domicilio> convertDomiciliowsToDomicilio(List<Domiciliows> domiciliows){
        List<Domicilio> domicilioList = new ArrayList<>();
        domiciliows.forEach(dom ->{
            domicilioList.add(convertDomiciliowsToDomicilio(dom));
        });
        return domicilioList;
    }
    public Domiciliows convertDomicilioToDomicilioWs(Domicilio domicilio){
        Domiciliows domiciliows = new Domiciliows();
        domiciliows.setIddomicilio(domicilio.getIddomicilio());
        domiciliows.setDescdomicilio(domicilio.getDescdomicilio());
        domiciliows.setNrodomicilio(domicilio.getNrodomicilio());
        domiciliows.setRefdomicilio(domicilio.getRefdomicilio());
        return domiciliows;
    }
    public List<Domiciliows> convertDomicilioToDomicilioWs(List<Domicilio> domicilio){
        List<Domiciliows> domicilioList = new ArrayList<>();
        domicilio.forEach(dom ->{
            domicilioList.add(convertDomicilioToDomicilioWs(dom));
        });
        return domicilioList;
    }

}
