package com.mycompany.segregacaointerfacecorreto;

public class Gerente extends Pessoa implements iGerente, iFuncionario {

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void gerenciarProdutos() {
        System.out.println("Produtos gerenciados!");
    }

    @Override
    public void calcularSalario() {
        System.out.println("O salario desse gerente é: " + this.getSalario());
    }
}
