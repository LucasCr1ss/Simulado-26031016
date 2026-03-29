/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladosete_;

/**
 *
 * @author CAROL
 */
public class ContaCorrente extends Conta{
    double limite;

    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor){
        if(valor <= (this.saldo + this.limite)){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado usando limite se necessario, Saldo: " + this.saldo);
        } else {
            System.out.println("Limite insuficiente");
        } 
    }
    
}
