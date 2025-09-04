package br.com.ipbcentralbetim.predestinado.models;

import java.util.Date;

public class Votacao {
    private Membro votante;
    private Date dataDeInicio;
    private Date dataFinal;
    private String descricao;

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Membro getVotante() {
        return votante;
    }

    public void setVotante(Membro votante) {
        this.votante = votante;
    }
}

