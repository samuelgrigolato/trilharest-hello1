package com.opensanca.trilharest.movies.filmes;


import com.opensanca.trilharest.movies.comum.Pagina;
import com.opensanca.trilharest.movies.comum.ParametrosDePaginacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/filmes")
public class FilmesAPI {

    @Autowired
    private FilmesRepository filmesRepository;

    @RequestMapping(path="", method=RequestMethod.GET)
    public Pagina<Filme> get(ParametrosDePaginacao parametrosDePaginacao) {
        LocalDate hoje = LocalDate.now();
        return filmesRepository.buscarPaginaEmExibicao(parametrosDePaginacao, hoje);
    }

    @RequestMapping(path="/{id}", method=RequestMethod.GET)
    public Filme getPorId(@PathVariable UUID id) {
        return filmesRepository.buscarPorId(id);
    }

}
