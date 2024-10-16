package Dao;

import java.util.List;
import java.util.Optional;

import Entity.Empresa;
import Entity.Linea;
import Entity.RepresentanteLegal;
import Entity.Solicitud;

public interface DaoRepresentanteLegal {

	  RepresentanteLegal create(RepresentanteLegal reple);

	    RepresentanteLegal update(RepresentanteLegal reple);

	    void delete(long id);

	    Optional<RepresentanteLegal> read(Long id);

	    List<RepresentanteLegal> readAll();
	}