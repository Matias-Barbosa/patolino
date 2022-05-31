package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.SplittableRandom;

public abstract class Pessoa {

    private String nome;
    public String documento;

    public Pessoa() {
        ArrayList<String> ListaNomes = new ArrayList<>();
        ListaNomes.add("Jose");
        ListaNomes.add("Guilherme");
        ListaNomes.add("Marcelo");
        ListaNomes.add("João");
        ListaNomes.add("Gustavo");
        var numero = new SplittableRandom();
        this.nome = ListaNomes.get(numero.nextInt(0, ListaNomes.size()));
    }

    public String getNome() {
        return nome;
    }

    public abstract String getDocumento();
}
