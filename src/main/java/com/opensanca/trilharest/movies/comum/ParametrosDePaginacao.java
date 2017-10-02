package com.opensanca.trilharest.movies.comum;

import io.swagger.annotations.ApiParam;

public class ParametrosDePaginacao {

    @ApiParam("número da página 1-based")
    private Integer pagina;

    @ApiParam("quantidade máxima de registros")
    private Integer tamanhoDaPagina;

    public Integer getPagina() {
        return pagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    public Integer getTamanhoDaPagina() {
        return tamanhoDaPagina;
    }

    public void setTamanhoDaPagina(Integer tamanhoDaPagina) {
        this.tamanhoDaPagina = tamanhoDaPagina;
    }
}
