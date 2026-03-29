/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladooito;

/**
 *
 * @author CAROL
 */
public class Veiculo {
    String marca;
    double capacidadeCarga;

    public Veiculo(String marca, double capacidadeCarga){
        this.marca = marca;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void exibirInfo(){
        System.out.println("------Gerenciamento de Veiculos------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Capacidade de Carga: " + this.capacidadeCarga);
    }
}
