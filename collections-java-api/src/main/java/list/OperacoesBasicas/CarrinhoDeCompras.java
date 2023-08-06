package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{

private List<Item> itemList;

public CarrinhoDeCompras(){
    itemList = new ArrayList<Item>();
}

public void adicionarItem(Item item) {
    itemList.add(item);
}

public void removerItem(String nome){
   List<Item> itensParaRemover = new ArrayList<Item>();
   for(Item i : itemList){
       if(i.getNome().equals(nome)){
        itensParaRemover.add(i);
       }
   }
   itemList.removeAll(itensParaRemover);
}

public double calculaValorTotal(List<Item> itens){
    double valorTotal = 0;
    
    for (Item item : itens){
       valorTotal += item.getPreco() * item.getQuantidade();
    }

    return valorTotal;
}

public void exibirItens(List<Item> itens){

    for (Item item : itemList){
           System.out.println(item.toString());
    }
}

public List<Item> getLista(){
    return itemList;
}

}