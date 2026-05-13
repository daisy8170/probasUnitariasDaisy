package com.contornos;

public class Carrito {
    private String[] produtos;
    private int cantidade;

    public Carrito(String[] produtos) {
        this.produtos = produtos;
        this.cantidade = produtos.length;
    }

    public int contarProdutos() {
        return cantidade;
    }

    public boolean conten(String produto) {
        for (String p : produtos) {
            if (p.equals(produto)) {
                return true;
            }
        }
        return false;
    }

    public boolean estaBaleiro() {
        return cantidade == 0;
    }
}