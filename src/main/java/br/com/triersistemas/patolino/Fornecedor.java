package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Fornecedor extends PessoaJuridica{

    private String produtos;

    public Fornecedor() {
        ArrayList<String> ListaProdutos = new ArrayList<>();
        ListaProdutos.add("Gel");
        ListaProdutos.add("Desodorante");
        ListaProdutos.add("Perfume");
        ListaProdutos.add("Remedio");

        var numero = new SplittableRandom();
        this.produtos = ListaProdutos.get(numero.nextInt(0, ListaProdutos.size()));
    }

    public String getProdutos() {
        return produtos;
    }
}
