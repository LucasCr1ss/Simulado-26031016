/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladonove;

/**
 *
 * @author CAROL
 */
public class Livro extends itemBiblioteca{
    int numPaginas;

    public Livro(String titulo, String autor, int numPaginas){
        super(titulo, autor);
        this.numPaginas = numPaginas;
        
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("------Gerenciamento Biblioteca------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numPaginas);
        
    }
}
