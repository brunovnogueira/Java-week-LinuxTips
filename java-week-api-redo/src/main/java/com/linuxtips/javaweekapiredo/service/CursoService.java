package com.linuxtips.javaweekapiredo.service;

import com.linuxtips.javaweekapiredo.model.Curso;
import com.linuxtips.javaweekapiredo.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<Curso> listarCursoPorId(Long id){
        return cursoRepository.findById(id)
                .map(curso -> ResponseEntity.ok().body(curso))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Curso> atualizarCursoPorId(Long id, Curso cursoAtualizado){
        return cursoRepository.findById(id)
                .map(cursoParaAtualizar -> {
                    cursoParaAtualizar.setNome(cursoAtualizado.getNome());
                    cursoParaAtualizar.setPessoaInstrutora(cursoAtualizado.getPessoaInstrutora());
                    cursoParaAtualizar.setPreco(cursoAtualizado.getPreco());

                    Curso updated = cursoRepository.save(cursoParaAtualizar);

                    return ResponseEntity.ok().body(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> deletePorId(Long id){
        return cursoRepository.findById(id)
                .map(cursoParaDeletar -> {
                    cursoRepository.delete(cursoParaDeletar);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
