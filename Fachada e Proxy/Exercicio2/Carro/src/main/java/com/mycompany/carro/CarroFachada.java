
package com.mycompany.carro;

public class CarroFachada {

CintoSeguranca cinto;
Farol farol;
Motor motor;
Porta porta;
Radio radio;

    public CarroFachada(CintoSeguranca cinto, Farol farol, Motor motor, Porta porta, Radio radio) {
        this.cinto = cinto;
        this.farol = farol;
        this.motor = motor;
        this.porta = porta;
        this.radio = radio;
    }


    public void iniciarCorrida(String nomePassageiro){
        
        System.out.println("Iniciado corrida de "+nomePassageiro+"!");
        cinto.travar();
        farol.acender();
        motor.ligar();
        porta.travar();
        radio.sintonizar();
      
    }
    
    
     public void finalizarCorrida(String nomePassageiro, double valorRecebido){
        
        System.out.println("Corrida de "+nomePassageiro+" finalizada! Você recebeu o valor de "+valorRecebido+"!");
        cinto.destravar();
        farol.apagar();
        motor.desligar();
        porta.destrancar();
        radio.desligarRadio();
      
    }

    
}
