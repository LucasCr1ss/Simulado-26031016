/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladodois;

/**
 *
 * @author Admin
 */
public class Pagamento {
        Double valor;
        String status;
        
        public Pagamento(Double valor, String status){
            this.valor = valor;
            this.status = status;
        }
        
        public void processarPagamentos() {
            System.out.println("------Gerenciamento de Pagamento------");
            System.out.println("Valor a ser Pago: " + this.valor);
        }
        
        public void exibirStatus(){
            System.out.println("Status de Pagamento:" + this.status);
        }

}
