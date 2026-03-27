/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladodois;

/**
 *
 * @author Admin
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pagamento p1 = new Pagamento (128.80, "PENDENTE");
        
        p1.processarPagamentos();
        p1.exibirStatus();
        
        PagamentoCartao pc1 = new PagamentoCartao(128.80, "************2345", "CONCLUIDO");
        pc1.processarPagamentos();
        pc1.exibirStatus();
        
        
    }
    
}
