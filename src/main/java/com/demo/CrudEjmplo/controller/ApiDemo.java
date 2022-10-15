package com.demo.CrudEjmplo.controller;

import com.demo.CrudEjmplo.service.AlumnoService;
import com.demo.CrudEjmplo.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ApiDemo {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/saludar")
    public String saluda(){

        return "Hola bienvenidos a Spring-Boot";
    }
    @GetMapping("/all")
    public ArrayList<Alumno> getAllAlumno(){
       return alumnoService.getAllAlumno();
    }
    @GetMapping("/find/{id}")
    public Optional<Alumno> getAlumnoById(@PathVariable("id") long id){
      return  alumnoService.getAlumnoById(id);
    }
    @PostMapping("/save")
    public Alumno saveAlumno(@RequestBody Alumno a){
        return alumnoService.saveAlumno(a);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAlumnoById(@PathVariable("id") long id){
        if(alumnoService.deleteAlumnoById(id))
            return "Se ha borrado el Alumno";
        else
            return "No se ha borrado el Alumno";
    }
}
