package com.linuxtips.javaweekapiredo.controller;

import com.linuxtips.javaweekapiredo.model.Curso;
import com.linuxtips.javaweekapiredo.service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CursoController {
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }
    private CursoService cursoService;

    @PostMapping("/cursos")
    @ResponseStatus(HttpStatus.CREATED)
    public Curso criarCurso(@RequestBody Curso curso){
        return cursoService.criarCurso(curso);
    }

    @GetMapping("/cursos")
    @ResponseStatus(HttpStatus.OK)
    public List<Curso> listarCursos(){
        return cursoService.listarCursos();
    }
}
