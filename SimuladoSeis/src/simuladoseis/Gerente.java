/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladoseis;

/**
 *
 * @author CAROL
 */
public class Gerente extends funcionario{
    String departamento;
            
    public Gerente(String nome, double Salario, String departamento) {
        super(nome, Salario);
        this.departamento = departamento;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("------Gerenciamento de Funcionarios------");
        System.out.println("Nome do Funcionario: " + this.nome);
        System.out.println("Salario do Funcionario: " + this.Salario);
        System.out.println("Departamento: " + this.departamento);
    }
    
}
