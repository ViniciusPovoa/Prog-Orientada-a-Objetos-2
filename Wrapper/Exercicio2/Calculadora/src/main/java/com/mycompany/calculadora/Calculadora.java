package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        CalculadoraBinaria calcBin = new CalculadoraBinaria();
        AdapterBinario adaptador = new AdapterBinario(calcBin);

        System.out.println("Digite a opcao desejada: ");
        System.out.println("(1) Abrir Calculadora Decimal");
        System.out.println("(2) Abrir Calculadora Binária");
        Scanner sc = new Scanner(System.in);
        int decisao = sc.nextInt();

        switch (decisao) {
            case 1:
                System.out.println("(1) Somar");
                System.out.println("(2) Subtrair");
                System.out.println("(3) Multiplicar");
                int dec = sc.nextInt();

                switch (dec) {
                    case 1:
                        System.out.println("Digite o valor A (decimal): ");
                        int valorADecimal = sc.nextInt();
                        System.out.println("Digite o valor B (decimal): ");
                        int valorBDecimal = sc.nextInt();
                        int resultadoDecimal = adaptador.somar(valorADecimal, valorBDecimal);
                        System.out.println("Soma (decimal): " + resultadoDecimal);
                        break;
                    case 2:
                        System.out.println("Digite o valor A (decimal): ");
                        int valorSubADecimal = sc.nextInt();
                        System.out.println("Digite o valor B (decimal): ");
                        int valorSubBDecimal = sc.nextInt();
                        int resultadoDecimalSub = adaptador.somar(valorSubADecimal, valorSubBDecimal);
                        System.out.println("Subtracão (decimal): " + resultadoDecimalSub);
                        break;
                    case 3:
                        System.out.println("Digite o valor A (decimal): ");
                        int valorADecimalMulti = sc.nextInt();
                        System.out.println("Digite o valor B (decimal): ");
                        int valorBDecimalMulti = sc.nextInt();
                        int resultadoDecimalMulti = adaptador.somar(valorADecimalMulti, valorBDecimalMulti);
                        System.out.println("Soma (decimal): " + resultadoDecimalMulti);
                        break;
                }

            case 2:
                System.out.println("(1) Somar");
                System.out.println("(2) Subtrair");
                System.out.println("(3) Multiplicar");
                int bin = sc.nextInt();

                switch (bin) {
                    case 1:
                        System.out.println("Digite o valor A");
                        String valorA = sc.next();
                        System.out.println("Digite o valor B");
                        String valorB = sc.next();
                        String resultadoSoma = adaptador.somar(valorA, valorB);
                        System.out.println("Soma: " + resultadoSoma);
                        break;

                    case 2:
                        System.out.println("Digite o valor A");
                        String valorSubA = sc.next();
                        System.out.println("Digite o valor B");
                        String valorSubB = sc.next();
                        String resultadoSubtracao = adaptador.subtrair(valorSubA, valorSubB);
                        System.out.println("Subtracao: " + resultadoSubtracao);
                        break;

                    case 3:

                }

        }

    }
}
