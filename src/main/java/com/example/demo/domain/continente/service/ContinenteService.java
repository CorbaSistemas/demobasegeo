package com.example.demo.domain.continente.service;

import com.example.demo.domain.continente.interfaces.repository.IContinenteRepository;
import com.example.demo.domain.continente.interfaces.service.IContinenteService;
import com.example.demo.domain.continente.model.entidade.Continente;
import com.example.demo.domain.pais.interfaces.service.IPaisService;
import com.example.demo.infra.configuration.Util;
import com.example.demo.infra.exceptions.BusinessException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Dionízio Inácio on 28/05/2024
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ContinenteService implements IContinenteService {

	private final IContinenteRepository repository;

	public Page<Continente> findAll(final Pageable pageable) {

		log.info("{} Buscando todos registros.", Util.LOG_PREFIX);
		return repository.findAll(pageable);
	}

	public Integer save(final Continente continente) {

		log.info("{} Cadastrando novo registro.", Util.LOG_PREFIX);
		try{
			return repository.save(continente).getIdContinente();
		} catch (Exception e){
			throw 	new BusinessException("Erro ao realizar cadastro", e);
		}
	}

	public Continente getById(final Integer id) {
		log.info("{} Buscando um determinado registro.", Util.LOG_PREFIX);
		return repository.findById(id).orElseThrow(() -> new BusinessException("Não foi encontrado registro para esses ID: " + id));
	}
}
