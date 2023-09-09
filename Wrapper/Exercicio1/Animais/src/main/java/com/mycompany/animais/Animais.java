
package com.mycompany.animais;



public class Animais {

    public static void main(String[] args) {
       
        
        Pato pato = new Pato(); 
        Ave avePato = new PatoAdapter(pato);
        PatoDomestico patoD = new PatoDomestico(pato);
        
        System.out.println("PATOS ======");
        patoD.descricao();
        patoD.emitirSom();
        patoD.voar();
        System.out.println("\n");
        System.out.println("PAVAO ======");
        
        Pavao pavao = new Pavao(); 
        Ave avePavao = new PavaoAdapter(pavao);
        PavaoAzul pavaoA = new PavaoAzul(pavao);
        
        pavaoA.descricao();
        pavaoA.emitirSom();
        pavaoA.voar();
        
        
        
        
        
        
        
        
        
    }
}
