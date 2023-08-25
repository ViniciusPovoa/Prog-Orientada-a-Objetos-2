
package com.mycompany.carros;


import java.util.Scanner;

public class Carros {

    public static void main(String[] args) {

        String modeloHonda;
        System.out.println("Para a Marca HONDA");
        try (Scanner scHon = new Scanner(System.in)) {
            System.out.println("Digite o modelo");
            modeloHonda = scHon.next();
        }
        //Aqui é utilizado o padrão Singleton, visto que cria uma uníca instância  que será utilizada várias vezes, com diferentes modelos de carro.
        IVehicleMaker honda = FabricanteCarroSingleton.getInstance("honda");

        if (honda != null) {
            //Já nessa parte, é utilizada a criação de objeto pela classe makeVehicle, que é uma fábrica, deixando 
            //assim a parte da criação de objetos mais escondida do cliente, tornando assim o código mais flexível.
            IVehicle carroH = honda.makeVehicle(modeloHonda);
            
            if (carroH != null) {
                carroH.drive();
                carroH.stop();
                carroH.start();
                System.out.println("Honda ok | Modelo digitado: "+modeloHonda);
            } else {
                System.out.println("Modelo não reconhecido");
            }
        } 
        //Aqui também é utilizado o padrão Singleton, é criado uma instância toyota que armazenará qualquer veículo, e poderá ser utilizada várias vezes
        //com um menor gasto de memória.
        IVehicleMaker toyota = FabricanteCarroSingleton.getInstance("toyota");
        
        String modeloToyota;
        System.out.println("Para a Marca TOYOTA");
        try (Scanner scToy = new Scanner(System.in)) {
            System.out.println("Digite o modelo");
            modeloToyota = scToy.next();
        }
        if (toyota != null) {
            //Aqui como na linha 24, é utilizado o padrão de Fábrica, está sendo criado uma instância de um veículo da classe Toyota
            // e essa instância é armazenada em carroT, que tem o tipo IVehicle, permitindo assim, utilizar os métodos de IVehicle.
          
            IVehicle carroT = toyota.makeVehicle(modeloToyota);
            
            if (carroT != null) {
                carroT.drive();
                carroT.stop();
                carroT.start();
                System.out.println("Toyota ok | Modelo digitado: "+modeloToyota);
            } else {
                System.out.println("Modelo não reconhecido");
            }
        } 
    }
}
