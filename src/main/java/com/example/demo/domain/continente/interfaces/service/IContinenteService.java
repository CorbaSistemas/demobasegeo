package com.example.demo.domain.continente.interfaces.service;

import com.example.demo.domain.continente.model.entidade.Continente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;

/**
 * @author Dionízio Inácio on 24/05/2024
 */
public interface IContinenteService {

	@Transactional
	public Page<Continente> findAll(final Pageable pageable);

	@Transactional
	public Integer save(final Continente continente);

	@Transactional
	public Continente getById(final Integer id);
}
