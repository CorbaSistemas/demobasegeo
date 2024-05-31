package com.example.demo.interfaces.dto;

import com.example.demo.domain.continente.model.entidade.Continente;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

/**
 * @author Dionízio Inácio on 28/05/2024
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContinenteRequestDTO {

	private Integer idContinente;

	private String nomePais;

	public static ContinenteRequestDTO parse(final Continente continente) {

		if (continente == null) {
			return null;
		}

		return ContinenteRequestDTO.builder()
			.idContinente(continente.getIdContinente())
			.nomePais(continente.getNomePais())
			.build();
	}
}
