package com.mycompany.inversaodependenciacorreto;

public class Alexa {

    iDispositivo dispositivo;

    public Alexa(iDispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public iDispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(iDispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ativar() {
        dispositivo.ligar();
    }

    public void desativar() {
        dispositivo.desligar();
    }
}
