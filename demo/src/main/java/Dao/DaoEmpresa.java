package Dao;

import java.util.List;
import java.util.Optional;

import Entity.Empresa;

public interface DaoEmpresa {
	Empresa create(Empresa emp);

	Empresa update(Empresa emp);

	void delete(long id);

	Optional<Empresa> read(Long id);

	List<Empresa> readAll();
}
