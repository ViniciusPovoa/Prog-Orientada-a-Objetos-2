
package com.mycompany.comercio;


public class SedexFrete implements FreteStrategy{

    @Override
    public double calcularFrete(CarrinhoDeCompras carrinho) {
        System.out.println("Utilizando frete sedex");
        return 10.0;
    }
    
}
