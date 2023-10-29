
package com.mycompany.comercio;


public class PixPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("Pagamento realizado com PIX");
    }
    
}