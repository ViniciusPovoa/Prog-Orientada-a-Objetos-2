
package com.mycompany.acoes;

public class Acoes {

    public static void main(String[] args) {
        
 
        SujeitoConcreto sujeito = new SujeitoConcreto(45, 10, 80);

        // Criando investidores do tipo observer
        Observer investidor1 = new Investidor();

        // Adicionando investidores como observadores
        sujeito.addObserver(investidor1);


        // Simulando variação de preço e notificando os observadores
        sujeito.notifyObservers(10); //saída valor baixo
        sujeito.notifyObservers(60); //saída valor médio
        sujeito.notifyObservers(90); //saída valor alto
        sujeito.controleAcoes(); //faz o controle de compra e venda das ações 
    }
}


