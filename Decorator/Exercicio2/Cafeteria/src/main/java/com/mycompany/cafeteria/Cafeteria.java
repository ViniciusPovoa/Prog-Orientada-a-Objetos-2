
package com.mycompany.cafeteria;

public class Cafeteria {

    public static void main(String[] args) {
        
        
        Bebida decaf = new Decaf();
        Bebida esp = new Espresso();
        Bebida cLeite = new Leite(esp);
        Bebida cChoc = new Chocolate(decaf);
        Bebida decCanela = new Canela(decaf);
        
        System.out.println("======= CAFETERIA DO VINI =======");
        System.out.println(cLeite.getDescricao());
        System.out.println(cLeite.calculaCusto());
        
        System.out.println(cChoc.getDescricao());
        System.out.println(cChoc.calculaCusto());
        
        System.out.println(decCanela.getDescricao());
        System.out.println(decCanela.calculaCusto()); 
        
    }
}
