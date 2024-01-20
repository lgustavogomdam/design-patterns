package io.github.lgustavogomdam;

public class Veiculo implements Decorator {
    @Override
    public Double informarPrecoProduto() {
        return 20000.0; // Preço base de um veículo
    }

    @Override
    public String informarDescricaoProduto() {
        return "O veículo possui características básicas de fábrica.";
    }
}
