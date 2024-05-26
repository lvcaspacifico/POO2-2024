package com.poo.springjpademo.repository;
import com.poo.springjpademo.entity.Curso;
import com.poo.springjpademo.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TurmaRepository   extends JpaRepository<Turma, Long> {
}
