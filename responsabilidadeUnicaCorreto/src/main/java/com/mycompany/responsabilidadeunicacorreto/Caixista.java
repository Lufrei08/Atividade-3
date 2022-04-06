package com.mycompany.responsabilidadeunicacorreto;

public class Caixista extends Pessoa {

    public Caixista(String login, String senha, String nome, String cargo, int idade, String setor) {
        super(login, senha, nome, cargo, idade, setor);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado com sucesso!");
    }

    public void emitirNotaFiscal() {
        System.out.println("Nota fiscal emitida com sucesso!");
    }
}
