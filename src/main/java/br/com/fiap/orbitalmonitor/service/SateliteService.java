package br.com.fiap.orbitalmonitor.service;

import br.com.fiap.orbitalmonitor.exception.RecursoNaoEncontradoException;
import br.com.fiap.orbitalmonitor.model.Satelite;
import br.com.fiap.orbitalmonitor.repository.SateliteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SateliteService {

    private final SateliteRepository repository;

    public SateliteService(SateliteRepository repository) {
        this.repository = repository;
    }

    public List<Satelite> listarTodos() {
        return repository.findAll();
    }

    public Satelite salvar(Satelite satelite) {
        return repository.save(satelite);
    }

    public Satelite buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RecursoNaoEncontradoException(
                                "Satélite não encontrado"
                        ));
    }

    public Satelite atualizar(Long id, Satelite sateliteAtualizado) {

        Satelite satelite = buscarPorId(id);

        satelite.setNome(sateliteAtualizado.getNome());
        satelite.setTipoOrbita(sateliteAtualizado.getTipoOrbita());
        satelite.setStatus(sateliteAtualizado.getStatus());

        return repository.save(satelite);
    }

    public void deletar(Long id) {

        Satelite satelite = buscarPorId(id);

        repository.delete(satelite);
    }
}