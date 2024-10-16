package Dao;

import java.util.List;
import java.util.Optional;

import Entity.Empresa;
import Entity.Solicitud;
import Entity.Ubigeo;

public interface DaoUbigeo {


    Ubigeo create(Ubigeo ubi);

    Ubigeo update(Ubigeo ubi);

    void delete(long id);

    Optional<Ubigeo> read(Long id);

    List<Ubigeo> readAll();
}