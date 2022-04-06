
package com.mycompany.abertofechadocorreto;

public class Quadrado implements Forma{
    private double comprimentoDosLados;
    private String cor;

    public Quadrado(double comprimentoDosLados, String cor) {
        this.comprimentoDosLados = comprimentoDosLados;
        this.cor = cor;
    }

    public double getComprimentoDosLados() {
        return comprimentoDosLados;
    }

    public void setComprimentoDosLados(double comprimentoDosLados) {
        this.comprimentoDosLados = comprimentoDosLados;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando quadrado com os lados de "+this.getComprimentoDosLados());
    }
    
    
}
