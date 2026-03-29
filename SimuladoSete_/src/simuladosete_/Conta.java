/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladosete_;

/**
 *
 * @author CAROL
 */
public class Conta {
    double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Deposito realizado, Saldo: " + this.saldo);
    }

    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado, Saldo: " + this.saldo);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
