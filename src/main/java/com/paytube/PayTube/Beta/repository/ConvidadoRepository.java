/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytube.PayTube.Beta.repository;

/**
 *
 * @author Marcos
 */
import com.paytube.PayTube.Beta.Model.Convidado;
import com.paytube.PayTube.Beta.Model.Evento;
import org.springframework.data.repository.CrudRepository;


public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}