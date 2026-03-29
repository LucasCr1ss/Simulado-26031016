/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladooito;

/**
 *
 * @author CAROL
 */
public class Caminhao extends Veiculo{
    int numeroEixos;

    public Caminhao(String marca, double capacidadeCarga, int numeroEixos){
        super(marca, capacidadeCarga);
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void exibirInfo(){
        System.out.println("------Gerenciamento de Veiculos------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Capacidade de carga: " + this.capacidadeCarga);
        System.out.println("Numero de eixos: " + this.numeroEixos);
    }
}
