
package com.mycompany.controledeimagens;

public class ControledeImagens {

    public static void main(String[] args) {
        
        //Esse exercício utiliza o padrão Proxy, onde cada Imagem só é exibida após ser carregada e passada pelo Proxy.
     
        Imagens imagem1 = new ImagensProxy("foto1.jpg");
        Imagens imagem2 = new ImagensProxy("foto2.jpg");
        
        imagem1.exibicaoImagem();
        imagem2.exibicaoImagem();
        
       
    }
}
