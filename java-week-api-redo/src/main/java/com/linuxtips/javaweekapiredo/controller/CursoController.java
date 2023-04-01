package com.linuxtips.javaweekapiredo.controller;

import com.linuxtips.javaweekapiredo.model.Curso;
import com.linuxtips.javaweekapiredo.service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/cursos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Curso> listarCursosPorId(@PathVariable Long id){
        return cursoService.listarCursoPorId(id);
    }

    @PutMapping("/cursos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Curso> atualizarCursoPorId(@PathVariable Long id, @RequestBody Curso curso){
        return cursoService.atualizarCursoPorId(id, curso);
    }

    @DeleteMapping("/cursos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> deletarCursoPorId(@PathVariable Long id){
        return cursoService.deletePorId(id);
    }
}
