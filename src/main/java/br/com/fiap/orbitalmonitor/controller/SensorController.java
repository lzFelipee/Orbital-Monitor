package br.com.fiap.orbitalmonitor.controller;

import br.com.fiap.orbitalmonitor.model.Sensor;
import br.com.fiap.orbitalmonitor.service.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
public class SensorController {

    private final SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sensor> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Sensor salvar(@RequestBody Sensor sensor) {
        return service.salvar(sensor);
    }

    @GetMapping("/{id}")
    public Sensor buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Sensor atualizar(
            @PathVariable Long id,
            @RequestBody Sensor sensor) {

        return service.atualizar(id, sensor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}