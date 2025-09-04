package br.com.ipbcentralbetim.predestinado.models;

import java.util.Date;

public class Contribuicao {
    private Membro ofertante;
    private double valor;
    private String tipo;
    private Date dataDaContribuicao;

    public Date getDataDaContribuicao() {
        return dataDaContribuicao;
    }

    public void setDataDaContribuicao(Date dataDaContribuicao) {
        this.dataDaContribuicao = dataDaContribuicao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Membro getOfertante() {
        return ofertante;


    }

    public void setOfertante(Membro ofertante) {
        this.ofertante = ofertante;
    }
}
