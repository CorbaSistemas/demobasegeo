package com.example.demo.interfaces.controller;

import com.example.demo.domain.continente.interfaces.controller.IContinenteController;
import com.example.demo.domain.continente.model.entidade.Continente;
import com.example.demo.domain.continente.service.ContinenteService;
import com.example.demo.infra.configuration.Util;
import com.example.demo.interfaces.dto.ContinenteRequestDTO;
import com.example.demo.interfaces.dto.ContinenteResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author Dionízio Inácio on 28/05/2024
 */
@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ContinenteController implements IContinenteController {

	private ContinenteService service;
	@Override public ResponseEntity<Page<ContinenteRequestDTO>> list(Pageable pageable) {

		log.info("{} Listando todos os faturamentos", Util.LOG_PREFIX);
		final Page<ContinenteRequestDTO> faturamentos = service.findAll(pageable)
			.map(ContinenteRequestDTO::parse);
		return ResponseEntity.ok(faturamentos);
	}

	@Override public ResponseEntity<ContinenteRequestDTO> getContinente(int id) {

		log.info("{} Buscando Continente", Util.LOG_PREFIX);
		return ResponseEntity.ok(ContinenteRequestDTO.parse(service.getById(id)));
	}

	@Override public ResponseEntity<Integer> postContinente(ContinenteResponseDTO continenteResponseDTO) {

		log.info("{} Realizando cadastro do Continente", Util.LOG_PREFIX);
		return ResponseEntity.ok(service.save(Continente.parse(continenteResponseDTO)));
	}
}
