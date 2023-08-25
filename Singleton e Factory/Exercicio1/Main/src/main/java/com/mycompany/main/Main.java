/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Vinicius
 */
public class Main {

     public static void main(String [] args ) {
        
        //FabricanteCelular apple = new Apple(); -- nao eh Singleton
        
        // utilizando o padrao Singleton
        FabricanteCelular apple = FabricanteCelularSingleton.getInstance("apple");

        // utilizando o padrao Fabrica
        Celular iphones = apple.constroiCelular("iphones");
        
        // utilizando o celular fabricado
        iphones.tiraFoto();
        iphones.fazLigacao();
        System.out.println("ok iphone S");

        // utilizando o padrao Singleton
        FabricanteCelular samsung = FabricanteCelularSingleton.getInstance("samsung");

        // utilizando o padrao Fabrica
        Celular galaxy8 = samsung.constroiCelular("galaxy8");
        
        // utilizando o celular fabricado
        galaxy8.tiraFoto();
        galaxy8.fazLigacao();
        System.out.println("ok galaxy8");
        
    }
    
}