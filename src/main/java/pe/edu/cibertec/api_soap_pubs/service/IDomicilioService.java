package pe.edu.cibertec.api_soap_pubs.service;

import pe.edu.cibertec.api_soap_pubs.model.Domicilio;

import java.util.List;

public interface IDomicilioService {

    List<Domicilio> listarDomicilios();

    Domicilio obtenerDomicilioxId(int id);

    Domicilio registrarActualizarDomicilio(Domicilio domicilio);

}
