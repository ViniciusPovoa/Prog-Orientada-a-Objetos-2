/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaria;

public class ToppingDecorator implements Pizza {
    
    Pizza pizza;
    
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double custo() {
        return pizza.custo();
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }
    
    
}
