package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Ubigeo;

@Repository
public interface UbigeoRepository extends JpaRepository<Ubigeo, Long> {

}
