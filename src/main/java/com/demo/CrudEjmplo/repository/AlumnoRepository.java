package com.demo.CrudEjmplo.repository;

import com.demo.CrudEjmplo.model.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
