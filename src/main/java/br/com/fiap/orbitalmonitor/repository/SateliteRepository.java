package br.com.fiap.orbitalmonitor.repository;

import br.com.fiap.orbitalmonitor.model.Satelite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SateliteRepository extends JpaRepository<Satelite, Long> {
}