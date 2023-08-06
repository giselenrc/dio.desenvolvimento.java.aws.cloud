
package main.java.list.OperacoesBasicas;

public class Item {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Item(){
        
    }

    public Item(String nome,double preco,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString() {
        return "Item - Descrição: " + this.nome +" Preço: "+ this.preco + " Quantidade: " + quantidade;
    }
}
