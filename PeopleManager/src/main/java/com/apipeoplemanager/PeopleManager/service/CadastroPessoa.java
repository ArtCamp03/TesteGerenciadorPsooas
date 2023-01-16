package com.apipeoplemanager.PeopleManager.service;

import com.apipeoplemanager.PeopleManager.datasource.model.Pessoa;
import com.apipeoplemanager.PeopleManager.repository.PessoaRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastroPessoa {
    private PessoaRepository pessoaRepository;

    public void cadastrarPessoa(Pessoa pessoa){

        pessoaRepository.saveAndFlush(pessoa);
    }

}
