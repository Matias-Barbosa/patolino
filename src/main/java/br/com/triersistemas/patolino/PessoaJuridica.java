package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class PessoaJuridica extends Pessoa{

    public PessoaJuridica() {
        this.documento = documento;
        ArrayList<String> numerosDocumento = new ArrayList<>();
        numerosDocumento.add("1");
        numerosDocumento.add("2");
        numerosDocumento.add("3");
        numerosDocumento.add("4");
        var numero = new SplittableRandom();
        this.documento = numerosDocumento.get(numero.nextInt(0, numerosDocumento.size()));
    }


    @Override
    public String getDocumento() {
        return super.documento;
    }
}
