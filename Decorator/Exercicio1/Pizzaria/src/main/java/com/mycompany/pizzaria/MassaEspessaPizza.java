/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaria;

public class MassaEspessaPizza implements Pizza {

    @Override
    public double custo() {
        return 90.0;
    }

    @Override
    public String getDescricao() {
        return "Pizza massa espessa";
    }
    
}
