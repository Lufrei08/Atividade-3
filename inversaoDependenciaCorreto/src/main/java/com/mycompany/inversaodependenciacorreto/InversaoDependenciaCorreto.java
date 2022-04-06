package com.mycompany.inversaodependenciacorreto;

public class InversaoDependenciaCorreto {

    public static void main(String[] args) {
        ArCondicionado A1 = new ArCondicionado("Quarto", 90.5);
        Lampada L1 = new Lampada("Sala", 6.7);
        L1.desligar();
        Alexa I1 = new Alexa(L1);
        I1.ativar();
        I1.desativar();
        I1.setDispositivo(A1);
        I1.ativar();
        I1.desativar();
    }
}
