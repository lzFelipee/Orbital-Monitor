package br.com.fiap.orbitalmonitor.repository;

import br.com.fiap.orbitalmonitor.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
}