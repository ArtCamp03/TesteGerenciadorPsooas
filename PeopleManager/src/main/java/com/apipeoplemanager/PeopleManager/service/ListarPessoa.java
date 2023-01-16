package com.apipeoplemanager.PeopleManager.service;

import com.apipeoplemanager.PeopleManager.datasource.model.Pessoa;
import com.apipeoplemanager.PeopleManager.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarPessoa {

    private PessoaRepository pessoaRepository;

        public List<Pessoa> buscarPessoas(){
            List<Pessoa> lstPessoas = pessoaRepository.findAll();
            return lstPessoas;
        }

}
