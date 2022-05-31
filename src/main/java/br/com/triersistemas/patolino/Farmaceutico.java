package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Farmaceutico extends PessoaFisica{

    private String ofertaDia;

    public Farmaceutico() {
        ArrayList<String> ListaOfertas = new ArrayList<>();
        ListaOfertas.add("Produtos De Limpeza");
        ListaOfertas.add("Alimentos");
        ListaOfertas.add("Cadeiras");
        ListaOfertas.add("Mesas");
        var numero = new SplittableRandom();
        this.ofertaDia = ListaOfertas.get(numero.nextInt(0, ListaOfertas.size()));
    }

    public String getOfertaDia() {
        return ofertaDia;
    }
}
