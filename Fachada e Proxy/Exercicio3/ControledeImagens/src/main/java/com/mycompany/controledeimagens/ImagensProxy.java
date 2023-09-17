
package com.mycompany.controledeimagens;

public class ImagensProxy implements Imagens{
    
    ImagensCarregadas imgCarregadas;
    private String nomeImagem;

    public ImagensProxy(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

    //Caso a imagemCarregada == null, ele instancia um objeto e passa como parâmetro o nome da imagem, para assim,
// só depois de carregada, que a imagem será exibida, ocorrendo um ''carregamento preguiçoso''.

    public void exibicaoImagem() {
        if(imgCarregadas == null){
            imgCarregadas = new ImagensCarregadas(nomeImagem);
        }
        imgCarregadas.exibicaoImagem();
    }
    
    
    
    
    
    
}
