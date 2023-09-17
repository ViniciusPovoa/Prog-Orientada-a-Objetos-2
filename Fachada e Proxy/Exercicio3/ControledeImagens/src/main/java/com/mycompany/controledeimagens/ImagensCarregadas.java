
package com.mycompany.controledeimagens;


//Classe que implementa imagens e acrescenta um método.

public class ImagensCarregadas implements Imagens {
    
    private String nomeImagem;

    public ImagensCarregadas(String nomeImagem) {
        this.nomeImagem = nomeImagem;
       
    }
    
    
    public void carregarImagem(){
        System.out.println("Carregando imagem "+ nomeImagem);
        
    }

    public void exibicaoImagem(){
        carregarImagem();
        System.out.println("Imagem sendo exibida: "+ nomeImagem);
        
    }

   
}
