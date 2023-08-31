
package com.mycompany.pizzaria;

public class Queijo extends ToppingDecorator {
    

    
    public Queijo(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public double custo() {
        return pizza.custo() + 13.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com Quejo";
    }
    
}
