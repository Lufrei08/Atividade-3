package com.mycompany.segregacaointerfacecorreto;

public class SegregacaoInterfaceCorreto {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("ErmanoTeu", 48, 3.585);
        Vendedor v1 = new Vendedor("Francisca", 25, 1.489);
        Estoquista e1 = new Estoquista("Micalateia", 30, 2.379);
        
        g1.calcularSalario();
        g1.gerenciarProdutos();
        
        v1.venderProduto();
        
        e1.conferirEstoque();
    }
}
