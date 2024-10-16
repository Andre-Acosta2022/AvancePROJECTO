package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Linea;

@Repository
public interface LineaRepository extends JpaRepository<Linea, Long> {

}
