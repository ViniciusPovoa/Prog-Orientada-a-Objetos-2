
package com.mycompany.compras;

public class CartaoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("logica para pagar com cartao");
    }
    
}