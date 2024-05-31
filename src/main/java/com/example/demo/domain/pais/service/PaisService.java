package com.example.demo.domain.pais.service;

import com.example.demo.domain.continente.model.entidade.Continente;
import com.example.demo.domain.pais.interfaces.repository.IPaisRepository;
import com.example.demo.domain.pais.interfaces.service.IPaisService;
import com.example.demo.domain.pais.model.entidade.Pais;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Dionízio Inácio on 28/05/2024
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PaisService implements IPaisService {

	private IPaisRepository repository;

	@Override public Page<Pais> findAll(Pageable pageable) {
		return null;
	}

	@Override public Integer save(Continente continente) {
		return null;
	}

	@Override public Continente getById(Integer id) {
		return null;
	}
}
