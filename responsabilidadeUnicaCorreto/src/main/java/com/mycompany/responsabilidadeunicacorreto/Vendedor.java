package com.mycompany.responsabilidadeunicacorreto;

public class Vendedor extends Pessoa {

    public Vendedor(String login, String senha, String nome, String cargo, int idade, String setor) {
        super(login, senha, nome, cargo, idade, setor);
    }

    public void efetuarVenda() {
        System.out.println("Venda realizada com sucesso, parabens!");
    }
}
