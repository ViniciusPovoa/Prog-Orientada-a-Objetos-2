package com.mycompany.comercio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> items = new ArrayList<>();

    public void adicionaItem(Item item) {
        items.add(item);

    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public int calculaTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPreco();
        }
        return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy) {
        int total = this.calculaTotal();
        strategy.pagar(total);

    }

    public double calculaFrete(FreteStrategy strategy) {
        return strategy.calcularFrete(this);
    }

}
