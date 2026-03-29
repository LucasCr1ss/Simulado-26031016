/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladonove;

/**
 *
 * @author CAROL
 */
public class itemBiblioteca {
    String titulo;
    String autor;

    public itemBiblioteca(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        
    }

    public void exibirDetalhes(){
        System.out.println("------Gerenciamento Biblioteca------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        
    }
}
