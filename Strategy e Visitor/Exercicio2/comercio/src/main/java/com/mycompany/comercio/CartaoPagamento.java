
package com.mycompany.comercio;

public class CartaoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("Pagamento realizado com Cartão");
    }
    
}