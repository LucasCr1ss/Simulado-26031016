/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladocinco;

/**
 *
 * @author Admin
 */
public class Leao extends Animal{
    
    public Leao(String nome, int idade, String habitat) {
        super(nome, idade, habitat);
    }
    
    public void emitirSom(){
        System.out.println("O Leao esta Rugindo");
        System.out.println("Ruge");
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("------Gerenciamento de Animais ZOOLu------");
        System.out.println("Tipo do Animal: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habitat Natural: " + this.habitat);
    }
    
}
