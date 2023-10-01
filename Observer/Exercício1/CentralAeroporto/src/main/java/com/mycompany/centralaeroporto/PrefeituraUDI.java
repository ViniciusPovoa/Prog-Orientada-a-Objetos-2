
package com.mycompany.centralaeroporto;


public class PrefeituraUDI implements Observer {
    
    
    @Override
    public void update(double temp, double umidade, double vento){
        if(umidade < 20.0){
        System.out.println("defesa civil alerta> baixa umidade");
        }
    }
    
}
