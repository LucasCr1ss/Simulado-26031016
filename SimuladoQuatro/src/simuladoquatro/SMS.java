/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladoquatro;

/**
 *
 * @author Admin
 */
public class SMS extends Notificacao{
    
    public SMS(String Destinatario, String Mensagem) {
        super(Destinatario, Mensagem);
    }
    
    @Override
    public void Noti(){
        System.out.println("---Notificacao de SMS---");
        System.out.println("Voce recebeu um recado de " + this.Destinatario + " via SMS");
    }
    
    @Override
    public void Enviar (){
        System.out.println("Responder Mensagem: " + this.Mensagem);
    }
    
}
