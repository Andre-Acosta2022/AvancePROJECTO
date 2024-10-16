package Dao;

import java.util.List;
import java.util.Optional;

import Entity.Empresa;
import Entity.Persona;

public interface DaoPersona {

    Persona create(Persona pe);

    Persona update(Persona pe);

    void delete(long id);

    Optional<Persona> read(Long id);

    List<Persona> readAll();
    }
