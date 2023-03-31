package com.linuxtips.javaweekapiredo.service;

import com.linuxtips.javaweekapiredo.model.Curso;
import com.linuxtips.javaweekapiredo.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    private CursoRepository cursoRepository;

    public Curso criarCurso(Curso curso){
        return cursoRepository.save(curso);
    }

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }
}
