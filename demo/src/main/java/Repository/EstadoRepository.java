package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
