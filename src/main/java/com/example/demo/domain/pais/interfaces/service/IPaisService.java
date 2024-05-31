package com.example.demo.domain.pais.interfaces.service;

import com.example.demo.domain.continente.model.entidade.Continente;
import com.example.demo.domain.pais.model.entidade.Pais;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;

/**
 * @author Dionízio Inácio on 24/05/2024
 */
public interface IPaisService {

	@Transactional
	public Page<Pais> findAll(final Pageable pageable);

	@Transactional
	public Integer save(final Continente continente);

	@Transactional
	public Continente getById(final Integer id);
}
