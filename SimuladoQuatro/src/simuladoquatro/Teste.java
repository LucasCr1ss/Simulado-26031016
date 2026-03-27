/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladoquatro;

/**
 *
 * @author Admin
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SMS s1 = new SMS ("Lucas", "Estou bem e vc?");
        s1.Noti();
        s1.Enviar();
        
        Email e1 = new Email ("Lucas", "Estou bem e vc?");
        e1.Noti();
        e1.Enviar();
        
    }
    
}
