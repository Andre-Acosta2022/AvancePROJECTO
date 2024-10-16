package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long > {

}
