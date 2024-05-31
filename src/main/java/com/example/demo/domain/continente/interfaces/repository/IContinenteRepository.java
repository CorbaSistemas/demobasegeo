package com.example.demo.domain.continente.interfaces.repository;

import com.example.demo.domain.continente.model.entidade.Continente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dionízio Inácio on 28/05/2024
 */
public interface IContinenteRepository  extends JpaRepository<Continente, Integer> {
}
