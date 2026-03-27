/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladoquatro;

/**
 *
 * @author Admin
 */
public class Email extends Notificacao{
    
    public Email(String Destinatario, String Mensagem) {
        super(Destinatario, Mensagem);
    }
    
    @Override
    public void Noti(){
        System.out.println("---Notificacao de Email---");
        System.out.println("Voce recebeu uma mensagem de " + this.Destinatario + " via EMAIL");
        System.out.println("Deja responder?");
    }
    
    @Override
    public void Enviar (){
        System.out.println("Responder Mensagem: " + this.Mensagem);
    }
    
}
