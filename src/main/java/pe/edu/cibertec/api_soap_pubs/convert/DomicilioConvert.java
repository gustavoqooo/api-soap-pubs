package pe.edu.cibertec.api_soap_pubs.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.api_soap_pubs.model.Domicilio;
import pe.edu.cibertec.ws.objects.Domiciliows;

import java.util.ArrayList;
import java.util.List;

@Component
public class DomicilioConvert {

    public Domicilio convertDomiciliowsToDomicilio(Domiciliows domiciliows){
        Domicilio domicilio = new Domicilio();
        domicilio.setIddomicilio(domiciliows.getIddomicilio());
        domicilio.setDescdomicilio(domiciliows.getDescdomicilio());
        domicilio.setNrodomicilio(domiciliows.getNrodomicilio());
        domicilio.setRefdomicilio(domiciliows.getRefdomicilio());
        return domicilio;

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
