package Dao;

import java.util.List;
import java.util.Optional;

import Entity.Empresa;
import Entity.Solicitud;

public interface DaoSolicitud {

    Solicitud create(Solicitud soli);

    Solicitud update(Solicitud soli);

    void delete(long id);

    Optional<Solicitud> read(Long id);

    List<Solicitud> readAll();
}