

package com.mycompany.carro;

public class Carro {

    public static void main(String[] args) {
        CintoSeguranca cinto = new CintoSeguranca();
        Farol farol = new Farol();
        Motor motor = new Motor();
        Porta porta = new Porta();
        Radio radio = new Radio();
        
        
        CarroFachada carro = new CarroFachada(cinto, farol, motor, porta, radio);
        
        carro.iniciarCorrida("Vinícius");
        System.out.println("\n");
        carro.finalizarCorrida("Vinícius Horácio", 50.0);
        
       
    }
}
