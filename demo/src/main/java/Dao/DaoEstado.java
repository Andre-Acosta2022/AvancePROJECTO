package Dao;

import java.util.List;
import java.util.Optional;

import Entity.Empresa;
import Entity.Estado;
import Entity.Linea;
import Entity.Solicitud;

public interface DaoEstado {


	Estado create(Estado es);

	Estado update(Estado es);

    void delete(long id);

    Optional<Estado> read(Long id);

    List<Estado> readAll();
}