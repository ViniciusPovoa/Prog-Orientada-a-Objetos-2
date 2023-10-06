
package com.mycompany.loja;

public class Loja {

    public static void main(String[] args) {
        
        //DIFERENÇA ENTRE O DECORATOR E TEMPLATE
        /* Com o Template, fornecemos uma estrutura comum para os algoritmos, enquanto o Decorator é usado para 
        quando precisamos adicionar responsabilidades a objetos de forma mais dinâmica.
        */
        
       
       PedidosTemplate pedidoOnline = new PedidoOnline();
       pedidoOnline.processaPedido("Celular", 2, 2000, "Criptomoedas");
           
       System.out.println("===========================");
       PedidosTemplate PedidoLoja = new PedidoLoja();
       PedidoLoja.processaPedido("Geladeira", 4, 3000, "Cartão de Crédito");
       
        
    }
}
