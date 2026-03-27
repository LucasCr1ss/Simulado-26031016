/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladotres;

/**
 *
 * @author Admin
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u1 = new Usuario ("463769674509", "Senha123", "Aluno", true);
        u1.logar();
        u1.autenticarSenha("Senha123");
        u1.mostraAcesso();
        u1.desativar();
    }
    
}
