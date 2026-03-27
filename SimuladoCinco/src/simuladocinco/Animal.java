/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladocinco;

/**
 *
 * @author Admin
 */
public class Animal {
    String nome;
    int idade;
    String habitat;
    
    public Animal (String nome, int idade, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
     
    }
    
    public void exibirInfo(){
        System.out.println("------Gerenciamento de Animais ZOOLu------");
        System.out.println("Tipo do Animal: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habitat Natural: " + this.habitat);
    }
    
}
