package br.com.fiap.orbitalmonitor.controller;

import br.com.fiap.orbitalmonitor.model.Satelite;
import br.com.fiap.orbitalmonitor.service.SateliteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/satelites")
public class SateliteController {

    private final SateliteService service;

    public SateliteController(SateliteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Satelite> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Satelite salvar(@RequestBody Satelite satelite) {
        return service.salvar(satelite);
    }

    @GetMapping("/{id}")
    public Satelite buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Satelite atualizar(
            @PathVariable Long id,
            @RequestBody Satelite satelite) {

        return service.atualizar(id, satelite);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}