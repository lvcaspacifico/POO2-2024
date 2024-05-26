package com.poo.springjpademo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String semestre;

    private String codTurma;

    @ManyToOne
    private Curso curso;
    public Turma(String semestre, String codTurma, Curso curso){
        this.semestre = semestre;
        this.codTurma = codTurma;
        this.curso = curso;
    }
}
