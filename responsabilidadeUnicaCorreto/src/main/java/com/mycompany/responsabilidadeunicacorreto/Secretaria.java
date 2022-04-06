package com.mycompany.responsabilidadeunicacorreto;

public class Secretaria extends Pessoa {

    public String telefone;

    public Secretaria(String telefone, String login, String senha, String nome, String cargo, int idade, String setor) {
        super(login, senha, nome, cargo, idade, setor);
        this.telefone = telefone;
    }

    public void agendarReunião() {
        System.out.println("Reuniao agendada com sucesso!");
    }
}
