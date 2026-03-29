/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladosete_;

/**
 *
 * @author CAROL
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(1000, 500);
        c1.depositar(200);
        c1.sacar(1300);
        c1.sacar(500);
    }
    
}
