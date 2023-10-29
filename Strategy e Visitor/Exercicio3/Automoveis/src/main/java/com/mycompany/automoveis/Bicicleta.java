
package com.mycompany.automoveis;

class Bicicleta extends Veiculo {
    private String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}