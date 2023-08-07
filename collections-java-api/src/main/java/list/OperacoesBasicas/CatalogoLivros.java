package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
   
    private List<Livro> livroList;

    public CatalogoLivros(){
        livroList = new ArrayList<Livro>();
    }

    public void  adicionarLivro(String titulo, String autor, int anoPublicacao) {
       livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<Livro>();
        for(Livro l : livroList){
            if(l.getAutor().equals(autor)){
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<Livro>();
        for(Livro l : livroList){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal ){
                livrosPorIntervaloAnos.add(l);
            }
        }
        return livrosPorIntervaloAnos;
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> livrosPorTitulo = new ArrayList<Livro>();
        for(Livro l : livroList){
            if(l.getAutor().equals(titulo)){
                livrosPorTitulo.add(l);
            }
        }
        return livrosPorTitulo;
    }
}

