package com.poo.springjpademo.repository;
import com.poo.springjpademo.entity.Curso;
import com.poo.springjpademo.entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository   extends JpaRepository<Curso, Long> {
}
