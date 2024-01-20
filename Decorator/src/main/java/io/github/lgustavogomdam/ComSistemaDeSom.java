package io.github.lgustavogomdam;

public class ComSistemaDeSom extends ProdutoDecorator {
    public ComSistemaDeSom(Decorator veiculo) {
        super(veiculo);
    }

    @Override
    public Double informarPrecoProduto() {
        return super.informarPrecoProduto() + 1500.0; // Custo do sistema de som
    }

    @Override
    public String informarDescricaoProduto() {
        return super.informarDescricaoProduto() + ", inclui um sistema de som de alta qualidade.";
    }
}
