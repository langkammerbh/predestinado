package br.com.ipbcentralbetim.predestinado.models;

public class Oferta {
    private Membro ofertante;
    private double valor;

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
