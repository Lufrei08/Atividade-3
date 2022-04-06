package com.mycompany.inversaodependenciacorreto;

public class Lampada implements iDispositivo {

    private boolean ligado;
    private String local;
    private double consumo;

    public Lampada(String local, double consumo) {
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
            System.out.println("A lampada ja esta ligada!");
        } else {
            this.setLigado(true);
            System.out.println("A lampa foi ligada!");
        }
    }

    @Override
    public void desligar() {
        if (this.isLigado() == false) {
            System.out.println("A lampada ja esta desligada!");
        } else {
            this.setLigado(false);
            System.out.println("A lampada foi desligada!");
        }

    }

}
