package com.apipeoplemanager.PeopleManager.controller;

import com.apipeoplemanager.PeopleManager.datasource.model.Pessoa;
import com.apipeoplemanager.PeopleManager.repository.PessoaRepository;
import com.apipeoplemanager.PeopleManager.service.ListarPessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class pessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private ListarPessoa serviceBuscarPessoas;

    // printa Hello word
    @GetMapping(path = "/pessoa")
    public String index(){
        return "Bem Vindo ao Gerenciador de pessoas!";
    }

    // busca todas as pessoas
    @GetMapping(path = "/pessoa/all")
    public List<Pessoa> buscarPessoa() {
        return serviceBuscarPessoas.buscarPessoas() ;
    }

    // busca as pessoas pelo ID
    @GetMapping(path = "/pessoa/id/{id}")
    public Optional <Pessoa> buscarPessoaId(@PathVariable(name = "id", required = true) Long id) {
        return pessoaRepository.findById(id);
    }

    // salva pessoa no banco
    @PostMapping(path = "/pessoa/savw")
    public void salvaPessoa(@RequestBody PessoaRepository pess) {
        pessoaRepository.save(pess);
    }

    // deleta pessoa do banco
    @DeleteMapping(path = "/pessoa/delete/{id}")
    public void deletePessoa(@PathVariable(name = "id", required = true) Long id) {
        pessoaRepository.deleteById(id);
    }


}
