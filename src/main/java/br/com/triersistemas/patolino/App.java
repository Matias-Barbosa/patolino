package br.com.triersistemas.patolino;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        PessoaFisica P = new PessoaFisica();
        P.getNome();
        P.getDocumento();
        Fornecedor F = new Fornecedor();
        F.getProdutos();
        Farmaceutico FT = new Farmaceutico();
        FT.getOfertaDia();
        FT.getNome();
        FT.getDocumento();
        System.out.println(P.getNome());
        System.out.println("CPF: " + P.getDocumento());
        System.out.println(F.getProdutos());
        System.out.println(FT.getOfertaDia());
    }
}