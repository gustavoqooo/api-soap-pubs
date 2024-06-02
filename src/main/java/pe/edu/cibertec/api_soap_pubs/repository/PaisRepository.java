package pe.edu.cibertec.api_soap_pubs.repository;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.objects.Abreviatura;
import pe.edu.cibertec.ws.objects.Pais;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaisRepository {
    private Map<String, Pais> paises = new HashMap<>();

    public PaisRepository(){
        Pais objPais = new Pais();
        objPais.setNombre("Perú");
        objPais.setAbreviatura(Abreviatura.PE);
        objPais.setCapital("Lima");
        objPais.setPoblacion(3000000);
        paises.put(objPais.getNombre(), objPais);
        objPais = new Pais();
        objPais.setNombre("Chile");
        objPais.setAbreviatura(Abreviatura.CL);
        objPais.setCapital("Santiago");
        objPais.setPoblacion(200000);
        paises.put(objPais.getNombre(), objPais);
        objPais = new Pais();
        objPais.setNombre("Uruguay");
        objPais.setAbreviatura(Abreviatura.UY);
        objPais.setCapital("Montevideo");
        objPais.setPoblacion(1000000);
        paises.put(objPais.getNombre(), objPais);
        objPais = new Pais();
        objPais.setNombre("Brasil");
        objPais.setAbreviatura(Abreviatura.BR);
        objPais.setCapital("Brasilia");
        objPais.setPoblacion(48000000);
        paises.put(objPais.getNombre(), objPais);
    }
    public Pais buscarPorNombre(String nomPais){
        return paises.get(nomPais);
    }
}
