package com.linuxtips.javaweekapiredo.repository;

import com.linuxtips.javaweekapiredo.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository<Tabela,TipoDaPK>
@Repository
public interface CursoRepository extends JpaRepository<Curso,Long>{
}
