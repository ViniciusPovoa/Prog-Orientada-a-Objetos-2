package com.mycompany.loja;

public abstract class PedidosTemplate {
    
    
    abstract void entrega();
    
    abstract void processaPagamento(String formaPagamento);
    
    abstract int calculaValor(int quantidade, int valor);
    
    public  void processaPedido(String item, int quantidade, int valorUnitario, String formaPagamento) {
        
        int valorTotal = calculaValor(quantidade, valorUnitario);
        System.out.println("Valor total do pedido de "+item+": "+ valorTotal);

        processaPagamento(formaPagamento);
        entrega();
    }
}
