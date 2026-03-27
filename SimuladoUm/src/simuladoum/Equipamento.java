/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladoum;

/**
 *
 * @author Admin
 */
public class Equipamento {
    String nome;
    String modelo;
    
    public Equipamento(String nome, String modelo){
        this.nome = nome;
        this.modelo = modelo;
    }
    
    public void exibirDados(){
        System.out.println("------Gerenciamento de Equipamentos------");
        System.out.println("Nome do Equipamento: " + this.nome);
        System.out.println("Modelo do Equipamento: " + this.modelo);
    
}
    
}
