package com.iglesiaweb.iglesiaweb.repositorio;

import com.iglesiaweb.iglesiaweb.models.Administrador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradoresRepo extends CrudRepository<Administrador, Integer> {
//é preciso herdar da clase crudrepository e colocar o integer pra ter o id auto incrmentavel
}
