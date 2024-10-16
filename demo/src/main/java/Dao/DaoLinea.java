package Dao;

import java.util.List;
import java.util.Optional;

import Entity.Empresa;
import Entity.Linea;
import Entity.Solicitud;

public interface DaoLinea {


    Linea create(Linea li);

    Linea update(Linea li);

    void delete(long id);

    Optional<Linea> read(Long id);

    List<Linea> readAll();
}