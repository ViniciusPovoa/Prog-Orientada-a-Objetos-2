
package com.mycompany.acoes;

public class Investidor implements Observer {

    @Override
    public void notifica(int valor) {
        if (valor < 20) {
            System.out.println("Valor muito baixo da ação");
        }
        
         if (valor > 30 && valor < 69) {
            System.out.println("Valor médio da ação");
        }
         
           if (valor > 70) {
            System.out.println("Valor alto da ação");
        }
    }
}
