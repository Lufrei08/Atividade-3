package com.mycompany.responsabilidadeunicacorreto;

import java.util.Scanner;

public class Estoquista extends Pessoa {

    public String assinaturaDigital;

    public Estoquista(String assinaturaDigital, String login, String senha, String nome, String cargo, int idade, String setor) {
        super(login, senha, nome, cargo, idade, setor);
        this.assinaturaDigital = assinaturaDigital;
    }

    public void conferirEstoque() {
        System.out.println("Olá, digite sua assinatura!");
        Scanner ler = new Scanner(System.in);
        String assinatura = ler.nextLine();
        System.out.println("Estoque conferido com sucesso, por: " + assinatura);
    }
}
