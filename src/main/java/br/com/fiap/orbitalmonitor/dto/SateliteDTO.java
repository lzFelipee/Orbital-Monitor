package br.com.fiap.orbitalmonitor.dto;

public class SateliteDTO {

    private String nome;
    private String tipoOrbita;
    private String status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
}