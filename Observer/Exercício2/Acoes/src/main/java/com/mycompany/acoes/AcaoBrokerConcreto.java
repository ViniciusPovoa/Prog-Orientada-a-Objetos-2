
package com.mycompany.acoes;

public class AcaoBrokerConcreto  implements AcaoBroker{

    @Override
    public void comprar() {
      System.out.println("Acao comprada");
    }

    @Override
    public void vender() { 
      System.out.println("Acao vendida");
    }
    
}
