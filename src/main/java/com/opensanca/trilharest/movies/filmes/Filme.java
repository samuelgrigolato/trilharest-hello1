package com.opensanca.trilharest.movies.filmes;

import java.time.Duration;
import java.time.LocalDate;
import java.util.UUID;

public class Filme {

    private UUID id;
    private String nome;
    private String sinopse;
    private Duration duracao; // java 8+
    private LocalDate inicioExibicao; // java8+ (por quê não Date? calendar? ZonedDateTime
    private LocalDate fimExibicao;

    public Filme() {
    }

    public Filme(UUID id, String nome, String sinopse, Duration duracao, LocalDate inicioExibicao, LocalDate fimExibicao) {
        this.id = id;
        this.nome = nome;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.inicioExibicao = inicioExibicao;
        this.fimExibicao = fimExibicao;
    }

    public boolean emExibicao(LocalDate referencia) {
        if (this.inicioExibicao == null || this.fimExibicao == null) {
            return false;
        }
        return (this.inicioExibicao.isEqual(referencia) || this.inicioExibicao.isBefore(referencia)) &&
                (this.fimExibicao.isEqual(referencia) || this.fimExibicao.isAfter(referencia));
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public LocalDate getInicioExibicao() {
        return inicioExibicao;
    }

    public void setInicioExibicao(LocalDate inicioExibicao) {
        this.inicioExibicao = inicioExibicao;
    }

    public LocalDate getFimExibicao() {
        return fimExibicao;
    }

    public void setFimExibicao(LocalDate fimExibicao) {
        this.fimExibicao = fimExibicao;
    }
}
