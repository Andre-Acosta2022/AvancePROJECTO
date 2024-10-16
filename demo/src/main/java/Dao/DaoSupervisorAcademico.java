package Dao;

import java.util.List;
import java.util.Optional;

import Entity.SupervisorAcademico;
import Entity.SupervisorEmpresarial;




public interface DaoSupervisorAcademico {

    SupervisorAcademico create(SupervisorAcademico suac);

    SupervisorAcademico update(SupervisorAcademico suac);

    void delete(long id);

    Optional<SupervisorAcademico> read(Long id);

    List<SupervisorAcademico> readAll();
}