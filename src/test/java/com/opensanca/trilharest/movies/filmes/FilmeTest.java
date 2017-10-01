package com.opensanca.trilharest.movies.filmes;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class FilmeTest {

    @Test
    public void foraDeExibicaoSeDatasNulas() {
        // preparação
        Filme filme = new Filme(null, null, null, null,
                null, null);
        LocalDate referencia = LocalDate.of(2017, 10, 5);
        // processamento
        boolean emExibicao = filme.emExibicao(referencia);
        // verificação
        Assert.assertFalse(emExibicao);
    }

    @Test
    public void emExibicaoSeDentroDeIntervaloDeDatas() {
        // preparação
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 1),
                LocalDate.of(2017, 10, 30));
        LocalDate referencia = LocalDate.of(2017, 10, 5);
        // processamento
        boolean emExibicao = filme.emExibicao(referencia);
        // verificação
        Assert.assertTrue(emExibicao);
    }

    @Test
    public void foraDeExibicaoSeForaDoIntervaloDeDatas() {
        // preparação
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 1),
                LocalDate.of(2017, 10, 30));
        LocalDate referencia = LocalDate.of(2017, 11, 5);
        // processamento
        boolean emExibicao = filme.emExibicao(referencia);
        // verificação
        Assert.assertFalse(emExibicao);
    }

}
