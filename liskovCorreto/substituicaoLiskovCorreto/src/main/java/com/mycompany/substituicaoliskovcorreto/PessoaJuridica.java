
package com.mycompany.substituicaoliskovcorreto;


public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, String endereco) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void pagarImpostoDeRenda(){
        System.out.println("Imposto pago!");
    }
    
    public void emitirNotaFiscal(){
        System.out.println("Nota emitida com sucesso!");
    }
}
