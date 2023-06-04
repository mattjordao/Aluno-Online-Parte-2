package com.alunoonline.Aluno.Online.service;

import com.alunoonline.Aluno.Online.model.Aluno;
import com.alunoonline.Aluno.Online.model.Disciplina;
import com.alunoonline.Aluno.Online.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository repository;

    public Disciplina create(Disciplina disciplina) {
        return repository.save(disciplina);
    }

    public List<Disciplina> findByProfessorId(Long professorId) {
        return repository.findByProfessorId(professorId);
    }
}
