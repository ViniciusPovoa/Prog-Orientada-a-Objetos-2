
package com.mycompany.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    
    List<Item> items = new ArrayList<>();
    
    public void adicionaItem(Item item){
        items.add(item);
        
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    
    public int calculaTotal(){
        int sum = 0;
	for(Item item : items){
            sum += item.getPreco();
        }
	return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        int total = this.calculaTotal();
        strategy.pagar(total);
        
    } 
}