package pe.edu.cibertec.api_soap_pubs.endpoint;


import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import pe.edu.cibertec.api_soap_pubs.repository.PaisRepository;
import pe.edu.cibertec.ws.objects.GetPaisRequest;
import pe.edu.cibertec.ws.objects.GetPaisResponse;

@AllArgsConstructor
@Endpoint
public class PaisEndPoint {

    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    private PaisRepository paisRepository;

    @PayloadRoot(namespace =  NAMESPACE_URL,
    localPart = "getPaisRequest")
    public GetPaisResponse getPais(@RequestPayload GetPaisRequest request){
        GetPaisResponse response = new GetPaisResponse();
        response.setPais(paisRepository.buscarPorNombre(request.getNombre()));
        return response;
    }
}
