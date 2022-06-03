package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.SplittableRandom;

public class PessoaFisica extends Pessoa{

    public PessoaFisica() {
        this.documento = documento;

        }
        public String geraCPF() {
            int digito1 = 0;
            int digito2 = 0;
            String dig;
            String numerosJuntos;
            String numeroGerado;
            int resto = 0;
            Random num1 = new Random();
            int n1 = num1.nextInt(10);
            int n2 = num1.nextInt(10);
            int n3 = num1.nextInt(10);
            int n4 = num1.nextInt(10);
            int n5 = num1.nextInt(10);
            int n6 = num1.nextInt(10);
            int n7 = num1.nextInt(10);
            int n8 = num1.nextInt(10);
            int n9 = num1.nextInt(10);
            int n10 = num1.nextInt(10);
            int soma = n1 * 2 + n2 * 3 + n3 * 4 + n4 * 5 + n5 * 6 + n6 * 7 + n8 * 9 + n9 * 10 + n10 * 10;
            int valor = (soma / 11) * 11;
            digito1 = (soma - valor);
            resto = digito1 % 11;
            if (digito1 < 2) {
                digito1 = 0;

            } else {
                digito1 = 11 - resto;
            }
            int soma2 = n1 * 2 + n2 * 3 + n3 * 4 + n4 * 5 + n5 * 6 + n6 * 7 + n8 * 9 + n9 * 10 + n10 * 10;
            int valor2 = (soma / 11) * 11;
            digito2 = (soma - valor);
            resto = digito1 % 11;
            if (digito2 < 2) {
                digito2 = 0;

            } else {
                digito2 = 11 - resto;
            }

            numerosJuntos = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4) + String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) +
                    String.valueOf(n8) + String.valueOf(n9) + "-";
            dig = String.valueOf(digito1) + String.valueOf(digito2);
            numeroGerado = numerosJuntos + dig;
            return numeroGerado;
        }



    @Override
    public String getDocumento() {
        return geraCPF();
    }
}
