package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Practicante;

@Repository
public interface PracticanteRepository extends JpaRepository< Practicante, Long>{

}
