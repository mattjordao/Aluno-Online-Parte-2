package com.alunoonline.Aluno.Online.repository;

import com.alunoonline.Aluno.Online.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
