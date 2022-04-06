package com.mycompany.segregacaointerfacecorreto;

public class Vendedor extends Pessoa implements iVendedor, iFuncionario {

    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void venderProduto() {
        System.out.println("Produto vendido com sucesso!");
    }

    @Override
    public void calcularSalario() {
        System.out.println("O salario desse vendedor é: " + this.getSalario());
    }

}
