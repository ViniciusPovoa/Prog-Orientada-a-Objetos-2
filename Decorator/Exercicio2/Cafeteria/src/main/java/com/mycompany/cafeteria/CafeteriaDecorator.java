
package com.mycompany.cafeteria;

public class CafeteriaDecorator implements Bebida {
    
    Bebida bebida;

    public CafeteriaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
    
    public double calculaCusto(){
        return bebida.calculaCusto();
    }
    public String getDescricao(){
        return bebida.getDescricao();
    }
    
    
    
}
