package com.apipeoplemanager.PeopleManager.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;

import java.time.LocalDate;

public class PessoaResource {
    @JsonProperty("nome_pessoa")
    private String nome;

    @JsonProperty("data_nascimento")
    private LocalDate dataNascimento;

    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("logadouro")
    private String logadouro;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("numero")
    private int numero;

    @JsonProperty("cidade")
    private String cidade;

    public PessoaResource(String nome, LocalDate dataNascimento, String endereco, String logadouro, String cep, int numero, String cidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.logadouro = logadouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
