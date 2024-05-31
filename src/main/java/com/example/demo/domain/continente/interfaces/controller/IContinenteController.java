package com.example.demo.domain.continente.interfaces.controller;

import com.example.demo.interfaces.dto.ContinenteRequestDTO;
import com.example.demo.interfaces.dto.ContinenteResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * @author Dionízio Inácio on 24/05/2024
 */
@RestController
@RequestMapping("/api/continente")
@CrossOrigin(origins = "*")
@Tag(name = "Continentes")
public interface IContinenteController {


	@GetMapping(produces = APPLICATION_JSON_UTF8_VALUE)
	ResponseEntity<Page<ContinenteRequestDTO>> list(
		@PageableDefault(sort = "nomeContinente", direction = Sort.Direction.DESC) Pageable pageable);


	@GetMapping(value =  "/{id}", produces = APPLICATION_JSON_UTF8_VALUE)
	ResponseEntity<ContinenteRequestDTO> getContinente(@PathVariable int id);


	@PostMapping( produces = APPLICATION_JSON_UTF8_VALUE)
	@Transactional
	ResponseEntity<Integer> postContinente( @RequestBody ContinenteResponseDTO continenteResponseDTO);

}
