package com.contornos;

public class Exame {
    private static final double NOTA_SOBRESALIENTE = 9;
    private static final double NOTA_NOTABLE = 7;
    private static final double NOTA_APROBADO = 5;

    private String alumno;
    private double nota;

    public Exame(String alumno, double nota) {
        this.alumno = alumno;
        this.nota = nota;
    }

    public String calcularResultado() {
        if (nota >= NOTA_SOBRESALIENTE) {
            return "Sobresaliente";
        } else if (nota >= NOTA_NOTABLE) {
            return "Notable";
        } else if (nota >= NOTA_APROBADO) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
    }
}