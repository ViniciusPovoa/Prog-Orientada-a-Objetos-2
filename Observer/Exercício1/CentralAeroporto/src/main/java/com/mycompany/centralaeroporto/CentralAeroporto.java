
package com.mycompany.centralaeroporto;

public class CentralAeroporto {

   public static void main(String[] args) {
        CET cet = new CET();
        PrefeituraUDI pref = new PrefeituraUDI();

        cet.addObserver(pref);

        cet.setUmidade(30.0);
        cet.setUmidade(10.0);

        Aeroporto aero = new Aeroporto();

        cet.addObserver(aero);
        cet.setVento(120.0);
        


    }
}