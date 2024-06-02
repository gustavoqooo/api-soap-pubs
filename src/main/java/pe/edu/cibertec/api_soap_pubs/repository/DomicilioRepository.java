package pe.edu.cibertec.api_soap_pubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_soap_pubs.model.Domicilio;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Integer> {
}
