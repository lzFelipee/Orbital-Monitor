package br.com.fiap.orbitalmonitor.model;

import br.com.fiap.orbitalmonitor.service.MonitoramentoService;
import jakarta.persistence.Entity;

@Entity
public class Satelite extends EntidadeEspacial implements MonitoramentoService {

    private String tipoOrbita;
    private String status;

    public String getTipoOrbita() {
        return tipoOrbita;
    }

    public void setTipoOrbita(String tipoOrbita) {
        this.tipoOrbita = tipoOrbita;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String gerarAlerta() {
        return "Satélite " + getNome() + " operando normalmente";
    }
}