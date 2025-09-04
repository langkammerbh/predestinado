package br.com.ipbcentralbetim.predestinado.models;

import java.util.Date;

public class Votacao {
    private Membro votante;
    private Date dataDeInicio;
    private Date dataFinal;

    public Membro getVotante() {
        return votante;
    }

    public void setVotante(Membro votante) {
        this.votante = votante;
    }
}

