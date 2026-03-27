/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladodois;

/**
 *
 * @author Admin
 */
public class PagamentoCartao extends Pagamento{
    String numeroDoCartao;

    public PagamentoCartao(Double valor, String status, String numeroDoCartao) {
        super(valor, status);
        this.numeroDoCartao = numeroDoCartao;
    }
    
    @Override
    public void processarPagamentos() {
            System.out.println("------Pagamento com Cartao------");
            System.out.println("Valor a ser Pago: " + this.valor);
            System.out.println("Numero do Cartao: " + this.numeroDoCartao);
            
        }
    
    @Override
    public void exibirStatus(){
            System.out.println("Status de Pagamento:" + this.status);
        }
    
}
