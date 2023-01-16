package com.apipeoplemanager.PeopleManager.repository;

import com.apipeoplemanager.PeopleManager.datasource.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

}
