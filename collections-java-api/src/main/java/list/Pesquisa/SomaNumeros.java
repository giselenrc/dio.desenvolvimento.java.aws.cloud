package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    List<Integer> numerosList;

    public SomaNumeros(){
        numerosList = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        
        for (int numero : numerosList){
            soma += numero;
        }    
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (int numero : numerosList){
            if (numero > maiorNumero){
                maiorNumero = numero;
            }
        } 
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        for (int numero : numerosList){
            if (numero < menorNumero){
                menorNumero = numero;
            }
        } 
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return numerosList;
    }
}
