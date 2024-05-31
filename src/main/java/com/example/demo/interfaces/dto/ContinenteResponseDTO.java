package com.example.demo.interfaces.dto;

import com.example.demo.domain.continente.model.entidade.Continente;
import com.example.demo.domain.continente.service.ContinenteService;
import lombok.*;

import javax.persistence.Column;
import java.util.ArrayList;

/**
 * @author Dionízio Inácio  on 28/05/2024
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ContinenteResponseDTO {

	private Integer idContinente;

	private String nomePais;

	public static ContinenteResponseDTO parse(final Continente continente) {

		if (continente == null) {
			return null;
		}

		return ContinenteResponseDTO.builder()
			.idContinente(continente.getIdContinente())
			.nomePais(continente.getNomePais())
			.build();
	}
}
