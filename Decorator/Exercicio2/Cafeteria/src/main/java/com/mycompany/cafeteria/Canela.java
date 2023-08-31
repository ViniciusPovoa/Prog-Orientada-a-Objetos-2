package com.mycompany.cafeteria;

public class Canela extends CafeteriaDecorator {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    public double calculaCusto() {
        return bebida.calculaCusto() + 15;
    }

    public String getDescricao() {
        return bebida.getDescricao() + " com canela";
    }

}
