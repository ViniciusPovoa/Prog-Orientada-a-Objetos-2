

package com.mycompany.automoveis;


public class Automoveis {

    public static void main(String[] args) {

        // Criação dos veículos
        Veiculo carro = new Carro("Vermelho", "Toyota", "Corolla");
        Veiculo onibus = new Onibus(40, 2020);
        Veiculo bicicleta = new Bicicleta("Azul");

        // Visitantes para imprimir dados e enviar mensagens
        VeiculoVisitor dadosVisitor = new VeiculoDadosVisitor();
        VeiculoVisitor mensagemVisitor = new VeiculoMensagemVisitor();

        // Exemplo de uso: imprimir dados
        carro.accept(dadosVisitor);
        onibus.accept(dadosVisitor);
        bicicleta.accept(dadosVisitor);

        // Exemplo de uso: enviar mensagens
        carro.accept(mensagemVisitor);
        onibus.accept(mensagemVisitor);
        bicicleta.accept(mensagemVisitor);
    }
}