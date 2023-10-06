
package com.mycompany.loja;

public class PedidoLoja extends PedidosTemplate {

    @Override
    void entrega() {
        System.out.println("Pedido retirado na loja.");
    }

    @Override
    void processaPagamento(String formaPagamento) {
        System.out.println("Pagamento realizado via Cartão de Crédito");
    }
 
    int calculaValor(int quantidade, int valor){
        return quantidade * valor;
    }
}
