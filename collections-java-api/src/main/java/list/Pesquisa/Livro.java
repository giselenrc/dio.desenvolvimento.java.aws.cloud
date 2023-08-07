package main.java.list.Pesquisa;

public class Livro {

private String titulo;
private String autor;
private int anoPublicacao;

public Livro(){

}

public Livro(String titulo, String autor, int anoPublicacao){
    this.titulo = titulo;
}

public void setTitulo(){
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
}

public void setAutor(){
    this.autor = autor;
}

public void setAnoPublicacao(){
    this.anoPublicacao = anoPublicacao;
}

public String getTitulo(){
    return this.titulo;
}

public String getAutor(){
    return this.autor;
}

public int getAnoPublicacao(){
    return this.anoPublicacao;
}

@Override
public String toString() {
    return "Livro - Título: " + this.titulo +" Autor: "+ this.autor + " Ano Publicação: " + anoPublicacao;
}

}
