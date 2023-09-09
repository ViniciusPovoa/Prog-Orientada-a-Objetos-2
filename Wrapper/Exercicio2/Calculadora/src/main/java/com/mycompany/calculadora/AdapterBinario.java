/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;


public class AdapterBinario implements CalculadoraBinariaAntiga, CalculadoraDecimal {
    
    private CalculadoraBinaria calcBin;

    public AdapterBinario(CalculadoraBinaria calcBin) {
        this.calcBin = calcBin;
    }

    @Override
    public String somar(String a, String b) {
      int numeroA = Integer.parseInt(a, 2);
        int numeroB = Integer.parseInt(b, 2); 

        int resultado = numeroA + numeroB;

        String resultadoBinario = Integer.toBinaryString(resultado);

        return resultadoBinario;
    }

    @Override
    public String subtrair(String a, String b) {
        
        int numeroA = Integer.parseInt(a, 2);
        int numeroB = Integer.parseInt(b, 2); 

        int resultado = numeroA - numeroB;

        String resultadoSubtracao = Integer.toBinaryString(resultado);

        return resultadoSubtracao;
    }
    
    
    public String multiplicar(String a, String b) {
     
        int numeroA = Integer.parseInt(a, 2);
        int numeroB = Integer.parseInt(b, 2); 

        int resultado = numeroA * numeroB;

        String resultadoMultiplicacao = Integer.toBinaryString(resultado);

        return resultadoMultiplicacao;
    }    

    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    
}
