package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Long>{

}
