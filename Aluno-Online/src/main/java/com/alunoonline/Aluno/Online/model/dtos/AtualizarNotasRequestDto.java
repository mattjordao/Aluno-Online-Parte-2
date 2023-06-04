package com.alunoonline.Aluno.Online.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class AtualizarNotasRequestDto {
    private Double nota1;
    private Double nota2;
}
