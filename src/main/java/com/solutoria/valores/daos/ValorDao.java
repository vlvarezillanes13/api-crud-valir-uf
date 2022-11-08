package com.solutoria.valores.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solutoria.valores.models.Valor;

@Repository
public interface ValorDao extends CrudRepository< Valor, Integer> {

}
