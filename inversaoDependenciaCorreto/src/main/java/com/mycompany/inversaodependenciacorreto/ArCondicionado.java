package com.mycompany.inversaodependenciacorreto;

public class ArCondicionado implements iDispositivo {

    private boolean ligado;
    private String local;
    private double consumo;

    public ArCondicionado(String local, double consumo) {
        this.ligado = false;
        this.local = local;
        this.consumo = consumo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public void ligar() {
        if (this.isLigado() == true) {
            System.out.println("O ar ja esta ligado!");
        } else {
            this.setLigado(true);
            System.out.println("O ar foi ligado!");
        }
    }

    @Override
    public void desligar() {
        if (this.isLigado() == false) {
            System.out.println("O ar ja esta desligado!");
        } else {
            this.setLigado(false);
            System.out.println("O ar foi desligado!");
        }

    }
}
