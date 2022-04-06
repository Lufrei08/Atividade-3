package com.mycompany.responsabilidadeunicacorreto;

public class ResponsabilidadeUnicaCorreto {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("ciclano", "951", "Ciclano da Silva Sauro", "Vendedor", 28, "Loja");
        Secretaria s1 = new Secretaria("(62) 984562345", "filisbina", "546",
                "Filisbina da Costa Quebrada", "Secretaria", 32, "Escritorio");
        Estoquista e1 = new Estoquista("12345678", "cleyton", "6969", "Cleyton das Quebrada", "Estoquista", 21, "Galpão");
        
        v1.efetuarVenda(); //O vendedor vende, está correto!
        //v1.agendar
        s1.agendarReunião();//A secretaria marcou a reunião, uau!
        e1.conferirEstoque();//Conferiu o estoque e não deve estar faltando nada :)
    }
}
