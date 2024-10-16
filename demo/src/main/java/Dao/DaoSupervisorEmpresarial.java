package Dao;

import java.util.List;
import java.util.Optional;

import Entity.SupervisorEmpresarial;




public interface DaoSupervisorEmpresarial {


    SupervisorEmpresarial create(SupervisorEmpresarial sem);

    void delete(long id);

    Optional<SupervisorEmpresarial> read(Long id);

    List<SupervisorEmpresarial> readAll();
}
