/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

public class PatoAdapter implements Ave{

   Pato pato;

    public PatoAdapter(Pato pato) {
        this.pato = pato;
    }

    @Override
    public void emitirSom() {
     pato.grasnar();
    }

    @Override
    public void voar() {
       pato.voar();
    }
    
}
