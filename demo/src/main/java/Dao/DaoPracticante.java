package Dao;

import java.util.List;
import java.util.Optional;

import Entity.Empresa;
import Entity.Practicante;

public interface DaoPracticante {
	  Practicante create(Practicante prac);

	    Practicante update(Practicante prac);

	    void delete(long id);

	    Optional<Practicante> read(Long id);

	    List<Practicante> readAll();
	}