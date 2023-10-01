
package com.mycompany.acoes;

public interface Sujeito {
    
    public void addObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObservers(int valor);
    public void getPrecoMinimo(int valor);
    public void getPrecoMaximo(int valor);
    public void getPrecoMedio(int valor);
    
}
