package com.alunoonline.Aluno.Online.repository;

import com.alunoonline.Aluno.Online.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
