
package com.mycompany.pizzaria;

public class Pizzaria {
    
    public static void main(String [] args) {
        
        Pizza massaFina = new MassaFinaPizza();
        Pizza massaEspessa = new MassaEspessaPizza();
        
        Pizza cOvo = new Ovo(massaFina);
        Pizza cTomate = new Tomate(massaEspessa);
        Pizza cQueijo = new Queijo(massaFina);
       
        
        
        System.out.println("====== PIZZARIA DO VINI ======");
        System.out.println(cOvo.getDescricao());
        System.out.println(cOvo.custo());

        System.out.println(cTomate.getDescricao());
        System.out.println(cTomate.custo());    
        
        System.out.println(cQueijo.getDescricao());
        System.out.println(cQueijo.custo());
        
        
    }
    
}
