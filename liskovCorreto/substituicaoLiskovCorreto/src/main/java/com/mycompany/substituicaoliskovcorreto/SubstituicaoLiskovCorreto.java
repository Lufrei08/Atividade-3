package com.mycompany.substituicaoliskovcorreto;

public class SubstituicaoLiskovCorreto {

    public static void main(String[] args) {
        
        PessoaFisica pf1 = new PessoaFisica("99999", "Fulano", "Rua dos Cantos nº97");
        pf1.pagarImpostoDeRenda();
        PessoaJuridica pj1 = new PessoaJuridica("88788785454", "TechMasterBlasterSolutions", "Rua dos Macacos nº89");
        pj1.pagarImpostoDeRenda();
        pj1.emitirNotaFiscal();
    }
}
