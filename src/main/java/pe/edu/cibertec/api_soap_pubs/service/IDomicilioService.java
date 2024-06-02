package pe.edu.cibertec.api_soap_pubs.service;
import pe.edu.cibertec.ws.objects.Domiciliows;

import java.util.List;

public interface IDomicilioService {

    List<Domiciliows> listarDomicilios();

    Domiciliows obtenerDomicilioxId(int id);

    Domiciliows registrarActualizarDomicilio(Domiciliows domicilio);

}
