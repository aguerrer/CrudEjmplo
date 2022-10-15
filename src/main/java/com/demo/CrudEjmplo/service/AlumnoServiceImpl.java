package com.demo.CrudEjmplo.service;
import com.demo.CrudEjmplo.service.AlumnoService;
import com.demo.CrudEjmplo.model.Alumno;
import com.demo.CrudEjmplo.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    @Override
    public ArrayList<Alumno> getAllAlumno() {
        return (ArrayList<Alumno>) alumnoRepository.findAll();
    }

    @Override
    public Optional<Alumno> getAlumnoById(long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public Alumno saveAlumno(Alumno a) {
        return alumnoRepository.save(a);
    }

    @Override
    public boolean deleteAlumnoById(long id) {
        try {
            Optional<Alumno> a= getAlumnoById(id);
            alumnoRepository.delete(a.get());
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
