
package com.mycompany.compras;

public class Item {
    
    private int preco;
    private String nome;
    
    public Item(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }

 
    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}