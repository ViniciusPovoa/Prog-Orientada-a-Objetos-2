/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafeteria;

public class Leite extends CafeteriaDecorator {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    public double calculaCusto() {
        return bebida.calculaCusto() + 9;
    }

    public String getDescricao() {
        return bebida.getDescricao() + " com leite";
    }

}
