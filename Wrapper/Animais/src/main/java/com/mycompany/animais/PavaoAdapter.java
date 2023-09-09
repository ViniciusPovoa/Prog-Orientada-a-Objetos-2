
package com.mycompany.animais;

public class PavaoAdapter implements Ave{
    
    
    Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    public void emitirSom() {
     pavao.cantar();
    }

    public void voar() {
       pavao.voar();
    }
}
