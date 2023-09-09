package com.mycompany.loja;

public class AdaptadorPagamento implements Pagamento {

    private Object metodoPagamento; 

    public AdaptadorPagamento(Object metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    @Override
    public double realizarPagamento(double valor) {
        if (metodoPagamento instanceof CartaodeCredito) {
            return ((CartaodeCredito) metodoPagamento).pagarwithCartao(valor);
        } else if (metodoPagamento instanceof Paypal) {
            return ((Paypal) metodoPagamento).pagarwithPaypal(valor);
        } else {
            System.out.println("Metodo de pagamento nao suportado");
            return 0;
        }
    }
}
