package com.example.demo.domain.continente.model.entidade;

import com.example.demo.interfaces.dto.ContinenteRequestDTO;
import com.example.demo.interfaces.dto.ContinenteResponseDTO;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * @author Dionízio Inácio on 24/05/2024
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name = "continentes")
public class Continente {

	@Id
	@Type(type = "int")
	@GeneratedValue(generator = "int")
	@GenericGenerator(name = "generator", strategy = "int")
	@Column(name = "id_continente", nullable = false, columnDefinition = "uniqueidentifier")
	private Integer idContinente;

	@Column(name = "nome_pais", nullable = false, length = 300)
	private String nomePais;

	public static Continente parse(final ContinenteResponseDTO dto) {

		if (dto == null) {
			return null;
		}

		return Continente.builder()
			.idContinente(dto.getIdContinente())
			.nomePais(dto.getNomePais())
			.build();
	}

	public static Continente parse(final ContinenteRequestDTO dto) {

		if (dto == null) {
			return null;
		}

		return Continente.builder()
			.idContinente(dto.getIdContinente())
			.nomePais(dto.getNomePais())
			.build();
	}
}
