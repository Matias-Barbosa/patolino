package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class PessoaFisica extends Pessoa{

    public PessoaFisica() {
        this.documento = documento;
        ArrayList<String> numerosDocumento = new ArrayList<>();
        numerosDocumento.add("123123123");
        var numero = new SplittableRandom();
        this.documento = numerosDocumento.get(numero.nextInt(0, numerosDocumento.size()));

    }


    @Override
    public String getDocumento() {
        return super.documento;
    }
}
