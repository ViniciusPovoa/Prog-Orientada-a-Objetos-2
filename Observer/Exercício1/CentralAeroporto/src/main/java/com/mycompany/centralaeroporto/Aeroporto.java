
package com.mycompany.centralaeroporto;

public class Aeroporto implements Observer {

    public void update(double temp, double umidade, double vento){
        if(vento < 100.0){
        System.out.println("defesa civil alerta> vento muito forte");
        }
    }
}
    