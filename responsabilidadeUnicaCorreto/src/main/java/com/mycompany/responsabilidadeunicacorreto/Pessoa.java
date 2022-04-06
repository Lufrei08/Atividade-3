package com.mycompany.responsabilidadeunicacorreto;

public abstract class Pessoa {

    private String login;
    private String senha;
    private String nome;
    private String cargo;
    private int idade;
    private String setor;

    public Pessoa(String login, String senha, String nome, String cargo, int idade, String setor) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.setor = setor;
    }

}
