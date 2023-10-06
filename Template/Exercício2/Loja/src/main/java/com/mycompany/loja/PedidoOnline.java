
package com.mycompany.loja;


public class PedidoOnline extends PedidosTemplate {

    @Override
    void entrega() {
        System.out.println("Entrega será realizada através do Correios.");
    }

    @Override
    void processaPagamento(String formaPagamento) {
        System.out.println("Pagamento efetuado via criptomoedas.");
    }


    @Override
    int calculaValor(int quantidade, int valor) {
        return quantidade * valor;
    }

   
}
