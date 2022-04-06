
package com.mycompany.substituicaoliskovcorreto;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String cpf, String nome, String endereco) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void pagarImpostoDeRenda(){
        System.out.println("Imposto pago!");
    }
}
