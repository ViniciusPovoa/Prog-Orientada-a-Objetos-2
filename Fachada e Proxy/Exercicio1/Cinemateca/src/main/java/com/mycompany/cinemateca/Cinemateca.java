
package com.mycompany.cinemateca;

public class Cinemateca {

    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaPipoca pipoqueira = new MaquinaPipoca();
        Projetor projetor = new Projetor();
        StreamingPlayer player = new StreamingPlayer();
        Telao telao = new Telao();
        
        
        HomeTheaterFachada homeTheater = new HomeTheaterFachada(amp, player, projetor, luzes, telao, pipoqueira);
 
		homeTheater.assistirFilme("Barbie");
                homeTheater.fimDoFilme();
    }
}