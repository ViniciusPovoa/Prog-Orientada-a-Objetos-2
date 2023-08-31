package com.mycompany.cafeteria;

public class Chocolate extends CafeteriaDecorator{

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    public double calculaCusto() {
        return bebida.calculaCusto() + 18;
    }

    public String getDescricao() {
        return bebida.getDescricao() + " com chocolate";
    }
}
