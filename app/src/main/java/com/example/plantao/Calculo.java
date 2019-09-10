package com.example.plantao;

public class Calculo {
    public double media(double[] valores){
        double soma = 0;
        for (int i = 0; i < valores.length; i++ ){
         soma += valores[i];
        }

        return soma/valores.length;
    }

    public double maior(double[] valores){
        double maior = 0;
        for (int i = 0; i < valores.length; i++){
            if (valores[i] >= maior){
                maior = valores[i];
            }
        }
        return maior;
    }

    public double QuantidadeDeAcertos(boolean[] respostas){
        double porcetangem = 0;
        return porcetangem;
    }

    public double PorcentagensDeAcertos(boolean[] respostas){
        double porcetangem = 0;
        return porcetangem;
    }

}
