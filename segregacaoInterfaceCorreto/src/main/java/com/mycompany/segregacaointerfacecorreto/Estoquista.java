package com.mycompany.segregacaointerfacecorreto;

public class Estoquista extends Pessoa implements iFuncionario, iEstoquista {

    public Estoquista(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void calcularSalario() {
        System.out.println("O salario desse estoquista é: " + this.getSalario());
    }

    @Override
    public void conferirEstoque() {
        System.out.println("Estoque conferido com sucesso!");
    }

}
