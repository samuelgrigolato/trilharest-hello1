package com.opensanca.trilharest.movies.filmes;


import com.opensanca.trilharest.movies.comum.EntidadeNaoEncontradaException;
import com.opensanca.trilharest.movies.comum.Pagina;
import com.opensanca.trilharest.movies.comum.ParametrosDePaginacao;

import java.time.LocalDate;
import java.util.UUID;

public interface FilmesRepository {

    Pagina<Filme> buscarPaginaEmExibicao(ParametrosDePaginacao parametrosDePaginacao,
                                         LocalDate referencia);

    /**
     * @throws EntidadeNaoEncontradaException
     */
    Filme buscarPorId(UUID id);

}
