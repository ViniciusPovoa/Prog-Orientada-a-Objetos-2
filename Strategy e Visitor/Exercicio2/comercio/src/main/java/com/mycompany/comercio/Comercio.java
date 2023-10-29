package com.mycompany.comercio;

public class Comercio {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionaItem(new Item("Chocolate KitKat", 5));
        carrinho.adicionaItem(new Item("Tenis Nike", 800));

        System.out.println("Itens que estão no carrinho:");
        for (Item item : carrinho.getItems()) {
            String nomeItem = item.getNome();
            System.out.println(nomeItem);
        }
        System.out.println("\n");

        System.out.println("Frete Utilizado: ");
        FreteStrategy freteStrategy = new SedexFrete();
        double frete = carrinho.calculaFrete(freteStrategy);

        PagamentoStrategy pagamentoStrategy = new PixPagamento();

        carrinho.realizaPagamento(pagamentoStrategy);

        System.out.println("Frete: R$" + frete);
    }
}
