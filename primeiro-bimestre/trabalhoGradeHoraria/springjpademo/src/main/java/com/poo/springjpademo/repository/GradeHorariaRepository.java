package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.GradeHoraria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeHorariaRepository extends JpaRepository<GradeHoraria, Long> {

    List<GradeHoraria> findAllByPrimeiroHorarioData(String data);

    List<GradeHoraria> findAllByPrimeiroHorarioTurmaCursoNome(String cursoNome);
}