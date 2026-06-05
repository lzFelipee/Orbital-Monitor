package br.com.fiap.orbitalmonitor.model;

import br.com.fiap.orbitalmonitor.service.MonitoramentoService;
import jakarta.persistence.Entity;

@Entity
public class Sensor extends EntidadeEspacial implements MonitoramentoService {

    private String tipo;
    private Double temperatura;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String gerarAlerta() {
        return "Sensor " + getNome() +
                " registrando temperatura de " + temperatura;
    }
}