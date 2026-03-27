/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladoquatro;

/**
 *
 * @author Admin
 */
public class Notificacao {
    String Destinatario;
    String Mensagem;
    
    public Notificacao(String Destinatario, String Mensagem){
        this.Destinatario = Destinatario;
        this.Mensagem = Mensagem;
    }
    
    public void Noti(){
        System.out.println("---Notificacao---");
        System.out.println("Voce recebeu uma mensagem de " + this.Destinatario);
        System.out.println("Deja responder?");
    }
    
    public void Enviar (){
        System.out.println("Responder Mensagem: " + this.Mensagem);
    }
    
}
