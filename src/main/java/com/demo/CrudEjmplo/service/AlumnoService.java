package com.demo.CrudEjmplo.service;

import com.demo.CrudEjmplo.model.Alumno;

import java.util.ArrayList;
import java.util.Optional;


public interface AlumnoService {
    ArrayList<Alumno> getAllAlumno();
    Optional<Alumno> getAlumnoById(long id);
    Alumno saveAlumno(Alumno a);
    boolean deleteAlumnoById(long id);

}
