package br.com.ipbcentralbetim.predestinado.models;

public class Contribuicao {
    private Membro ofertante;
    private double valor;
    private String tipo;

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
