
package com.mycompany.centralaeroporto;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class CET implements Sujeito {

    // Inicializando a lista de observadores
    List<Observer> observers = new ArrayList<>();

    double temp, umidade, vento;

    public void setTemp(double temp){
        this.temp = temp;
        notifyObservers();
    }

    public void setUmidade(double umidade){
        this.umidade = umidade;
        notifyObservers();
    }

    public void setVento(double vento){
        this.vento = vento;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temp, umidade, vento);
        }
    }
}
