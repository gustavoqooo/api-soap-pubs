package pe.edu.cibertec.api_soap_pubs.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_soap_pubs.convert.DomicilioConvert;
import pe.edu.cibertec.api_soap_pubs.model.Domicilio;
import pe.edu.cibertec.api_soap_pubs.repository.DomicilioRepository;
import pe.edu.cibertec.ws.objects.Domiciliows;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DomicilioService implements  IDomicilioService {

    private DomicilioRepository domicilioRepository;
    private DomicilioConvert domicilioConvert;


    @Override
    public List<Domiciliows> listarDomicilios() {
        return domicilioConvert.convertDomicilioToDomicilioWs(
                domicilioRepository.findAll());
    }

    @Override
    public Domiciliows obtenerDomicilioxId(int id) {
        Optional<Domicilio> domicilio = domicilioRepository.findById(id);
        return domicilio.map(value ->
                domicilioConvert.convertDomicilioToDomicilioWs(value))
                .orElse(null);
    }

    @Override
    public Domiciliows registrarActualizarDomicilio(Domiciliows domiciliows) {
        Domicilio nuevoDomicilio = domicilioRepository.save(
                domicilioConvert.convertDomiciliowsToDomicilio(domiciliows));
        if(nuevoDomicilio == null)
            return  null;
        return domicilioConvert.convertDomicilioToDomicilioWs(nuevoDomicilio);
    }
}
