package model;

import java.util.ArrayList;

public class ListaDeLivros {

    private ArrayList<Livro> lista;

    public ListaDeLivros() {
        this.lista = new ArrayList<Livro>();
    }

    public ArrayList<Livro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Livro> lista) {
        this.lista = lista;
    }

    public void cadastrarLivro(Livro livro) {
        this.lista.add(livro);
    }

    public boolean buscarLivro(int numero) {
        for (Livro busca : lista) {
            if (busca.getNumero() == numero) {
                return true;
            }
        }
        return false;
    }

    public Livro retirarLivro(int numero, String nomeVizinho){

        for (Livro retirada : lista){
            if (retirada.getNumero() == numero && retirada.getStatus().equals(StatusEnum.DISPONIVEL)){
                retirada.setNomeVizinho(nomeVizinho);
                retirada.setStatus(StatusEnum.INDISPONIVEL);
                Livro retorno = retirada;
                return retorno;
            }

        }
        return null;
    }

    public Livro devolverLivro(int numero){

        for (Livro retirada : lista){
            if (retirada.getNumero() == numero && retirada.getStatus().equals(StatusEnum.INDISPONIVEL)){
                retirada.setNomeVizinho("");
                retirada.setStatus(StatusEnum.DISPONIVEL);
                Livro retorno = retirada;
                return retorno;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "{" + lista +"}";
    }
}
