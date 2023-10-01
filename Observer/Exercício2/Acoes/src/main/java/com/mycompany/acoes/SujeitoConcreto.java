package com.mycompany.acoes;

import java.util.ArrayList;
import java.util.List;

public class SujeitoConcreto implements Sujeito {

    private int precoMinimo;
    private int precoMaximo;

    public SujeitoConcreto(int precoMedio, int precoMinimo, int precoMaximo) {
        this.valor = valor;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
        getPrecoMinimo(precoMinimo);
        getPrecoMedio(precoMedio);
        getPrecoMaximo(precoMaximo);
    }

    AcaoBrokerConcreto acao = new AcaoBrokerConcreto();

    @Override
    public void getPrecoMinimo(int precoMinimo) {
        System.out.println("O preco Mínimo eh: " + precoMinimo);
    }

    @Override
    public void getPrecoMedio(int precoMedio) {
        System.out.println("O preco Médio eh: " + precoMedio);
    }

    @Override
    public void getPrecoMaximo(int precoMaximo) {
        System.out.println("O preco Médio eh: " + precoMaximo);
    }

    public void controleAcoes() {
        if (precoMaximo >= 80) {
            acao.vender();
        }
        
        if(precoMinimo <= 10) {
            acao.comprar();
        }
    }


    private int valor;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    public void notifyObservers(int valor) {
        for (Observer observer : observers) {
            observer.notifica(valor);
        }
    }

}
