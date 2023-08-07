package main.java;

import main.java.list.OperacoesBasicas.CarrinhoDeCompras;
import main.java.list.OperacoesBasicas.Item;

public class App {
    public static void main(String[] args) throws Exception {

        // Testando carrinho de Compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(new Item("Caneta",3.50,2));
        carrinho.adicionarItem(new Item("Borracha",1.75,3));
        carrinho.adicionarItem(new Item("Lapis",1.00,3));

        carrinho.exibirItens(carrinho.getLista());
        System.out.println("Valor Total: "+carrinho.calculaValorTotal(carrinho.getLista()));
        System.out.println("------------------------------------------");

        carrinho.removerItem("Lapis");

        carrinho.exibirItens(carrinho.getLista());
        System.out.println("Valor Total: "+carrinho.calculaValorTotal(carrinho.getLista()));
    }
}
