package com.contornos;


public class Semaforo {
    private String cor;

    public Semaforo(String cor) {
        this.cor = cor;
    }

    public boolean podesPasar() {
        return cor.equals("verde");
    }

    public boolean tesQueParar() {
        return cor.equals("vermello");
    }
}