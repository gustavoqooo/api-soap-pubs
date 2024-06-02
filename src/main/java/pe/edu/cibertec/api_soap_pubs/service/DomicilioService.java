package pe.edu.cibertec.api_soap_pubs.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_soap_pubs.model.Domicilio;
import pe.edu.cibertec.api_soap_pubs.repository.DomicilioRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DomicilioService implements  IDomicilioService {

    private DomicilioRepository domicilioRepository;


    @Override
    public List<Domicilio> listarDomicilios() {
        return domicilioRepository.findAll();
    }

    @Override
    public Domicilio obtenerDomicilioxId(int id) {
        return domicilioRepository.findById(id).orElse(null);
    }

    @Override
    public Domicilio registrarActualizarDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }
}
