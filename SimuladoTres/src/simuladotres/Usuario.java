/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladotres;

/**
 *
 * @author Admin
 */
public class Usuario {
    String login;
    String senha;
    String nivAcesso;
    boolean ativo; 
    
    public Usuario (String login, String senha, String nivAcesso, boolean ativo){
        this.login = login; 
        this.senha = senha;
        this.nivAcesso = nivAcesso;
        this.ativo = ativo;
    }
    
    public void logar(){
        System.out.println("Seu login é: " + this.login);
        System.out.println("Sua senha é: " + this.senha);
    }
    
    public void autenticarSenha(String senhaInformada) {
        if (senhaInformada.equals(this.senha) && this.ativo == true){
           System.out.println("Bem vindo");
        } else {
            System.out.println("Senha incorreta");
        }
            
    }
    
    public void desativar(){
        this.ativo = false;
        System.out.println("O usario ainda é Ativo? " + this.ativo);
    }
    
    public void mostraAcesso(){
        System.out.println("Seu nivel de Acesso é: " + this.nivAcesso);
    }
}
