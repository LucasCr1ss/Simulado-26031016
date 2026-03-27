/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladocinco;

/**
 *
 * @author Admin
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arara a1 = new Arara ("Arara", 3, "Pantanal");
        a1.exibirInfo();
        a1.emitirSom();
        
        Leao l1 = new Leao ("Leao", 10, "Savana");
        l1.exibirInfo();
        l1.emitirSom();
    }
    
}
