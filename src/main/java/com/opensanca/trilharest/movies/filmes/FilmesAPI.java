package com.opensanca.trilharest.movies.filmes;


import com.opensanca.trilharest.movies.comum.Pagina;
import com.opensanca.trilharest.movies.comum.ParametrosDePaginacao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/filmes")
@Api("Filmes")
public class FilmesAPI {

    @Autowired
    private FilmesRepository filmesRepository;

    @RequestMapping(path="", method=RequestMethod.GET)
    @ApiOperation(value="Buscar página de filmes em exibição",
        notes="Permite buscar uma página de registros em exibição. " +
              "Um filme em exibição é um filme que possui ambas " +
              "datas de início/fim e cujo período contempla a data de hoje")
    public Pagina<Filme> get(ParametrosDePaginacao parametrosDePaginacao) {
        LocalDate hoje = LocalDate.now();
        return filmesRepository.buscarPaginaEmExibicao(parametrosDePaginacao, hoje);
    }

    @RequestMapping(path="/{id}", method=RequestMethod.GET)
    @ApiOperation("Buscar filme por ID")
    public Filme getPorId(@ApiParam("identificador do filme") @PathVariable UUID id) {
        return filmesRepository.buscarPorId(id);
    }

}
