package br.com.fiap.orbitalmonitor.service;

import br.com.fiap.orbitalmonitor.model.Sensor;
import br.com.fiap.orbitalmonitor.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository repository;

    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public List<Sensor> listarTodos() {
        return repository.findAll();
    }

    public Sensor salvar(Sensor sensor) {
        return repository.save(sensor);
    }

    public Sensor buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sensor não encontrado"));
    }

    public Sensor atualizar(Long id, Sensor sensorAtualizado) {

        Sensor sensor = buscarPorId(id);

        sensor.setNome(sensorAtualizado.getNome());
        sensor.setTipo(sensorAtualizado.getTipo());
        sensor.setTemperatura(sensorAtualizado.getTemperatura());

        return repository.save(sensor);
    }

    public void deletar(Long id) {

        Sensor sensor = buscarPorId(id);

        repository.delete(sensor);
    }
}