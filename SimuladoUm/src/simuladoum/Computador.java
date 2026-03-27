/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladoum;

/**
 *
 * @author Admin
 */
public class Computador extends Equipamento{
    String processador;
    
    public Computador(String nome, String modelo, String processador) {
        super(nome, modelo);
        this.processador = processador;
        
    }
    
    @Override
    public void exibirDados(){
        System.out.println("------Gerenciamento de Equipamentos------");
        System.out.println("Nome do Equipamento: " + this.nome);
        System.out.println("Modelo do Equipamento: " + this.modelo);
        System.out.println("Processador: " + this.processador);
        
}
    
}
