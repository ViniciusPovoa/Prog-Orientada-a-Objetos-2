/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemateca;

public class HomeTheaterFachada {
	Amplificador amp;
	StreamingPlayer player;
	Projetor projetor;
	Luzes luzes;
	Telao telao;
	MaquinaPipoca pipoqueira;
 
	public HomeTheaterFachada(Amplificador amp,
                    StreamingPlayer player,
                    Projetor projetor,
                    Luzes luzes,
                    Telao telao,
                    MaquinaPipoca pipoqueira) {
 
		this.amp = amp;
		this.player = player;
		this.projetor = projetor;
		this.telao = telao;
		this.luzes = luzes;
		this.pipoqueira = pipoqueira;
	}
 
	public void assistirFilme(String filme) {
            
		System.out.println("Preparando para meu filme domingo a tarde...");
                pipoqueira.liga();
                pipoqueira.arrebentaPipoca();
                luzes.desliga();
                telao.abaixa();
                projetor.liga();
                amp.liga();
                amp.ajustaVolume(10);
                player.liga();
                player.play(filme);
                
	}
 
 
	public void fimDoFilme() {
		System.out.println("Desligando meu kit home theater...");
		
	}

}