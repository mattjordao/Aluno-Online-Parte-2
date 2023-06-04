package com.alunoonline.Aluno.Online.model.dtos;

import lombok.Data;

import java.util.List;

@Data
public class HistoricoAlunoDto {
    private String nomeAluno;
    private String cursoAluno;
    private List<DisciplinasAlunoDto> disciplinasAlunoList;
}
