
package com.mycompany.automoveis;

interface VeiculoVisitor {
    void visit(Carro carro);
    void visit(Onibus onibus);
    void visit(Bicicleta bicicleta);
}