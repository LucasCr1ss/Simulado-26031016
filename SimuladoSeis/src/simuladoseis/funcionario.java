/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladoseis;

/**
 *
 * @author CAROL
 */
public class funcionario {
    String nome;
    double Salario;
    
    public funcionario(String nome, double Salario){
        this.nome = nome;
        this.Salario = Salario;
    }
    
    public void exibirDados(){
        System.out.println("------Gerenciamento de Funcionarios------");
        System.out.println("Nome do Funcionario: " + this.nome);
        System.out.println("Salario do Funcionario: " + this.Salario);
    }
    
}
