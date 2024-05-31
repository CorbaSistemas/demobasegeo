package com.example.demo.domain.pais.model.entidade;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

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
@Table(name = "paises")
public class Pais {

	@Id
	@Type(type = "uuid-char")
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "generator", strategy = "uuid2")
	@Column(name = "id_pais", nullable = false, columnDefinition = "uniqueidentifier")
	private int idPais;

	@Column(name = "nome_pais", nullable = false, length = 300)
	private String nomePais;
}
