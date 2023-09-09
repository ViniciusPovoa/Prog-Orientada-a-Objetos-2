package com.mycompany.loja;
public class Loja {

    public static void main(String[] args) {

        CartaodeCredito cartao = new CartaodeCredito();

        Paypal paypal = new Paypal();

        Pagamento adaptadorCartao = new AdaptadorPagamento(cartao);
        Pagamento adaptadorPaypal = new AdaptadorPagamento(paypal);

        double valorASerPago = 75.0;
        double resultadoPagamentoCartao = adaptadorCartao.realizarPagamento(valorASerPago);
        double resultadoPagamentoPaypal = adaptadorPaypal.realizarPagamento(valorASerPago);


        if (resultadoPagamentoCartao > 0) {
            System.out.println("Pagamento com cartão bem sucedido");
        } else {
            System.out.println("Pagamento com cartão falhou");
        }

        if (resultadoPagamentoPaypal > 0) {
            System.out.println("Pagamento com PayPal bem sucedido!");
        } else {
            System.out.println("Pagamento com PayPal falhou.");
        }
    }
}
