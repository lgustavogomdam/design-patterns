package io.github.lgustavogomdam;

public abstract class ProdutoDecorator implements Decorator {
    private final Decorator veiculoDecorator;

    public ProdutoDecorator(Decorator veiculoDecorator) {
        this.veiculoDecorator = veiculoDecorator;
    }

    @Override
    public Double informarPrecoProduto() {
        return veiculoDecorator.informarPrecoProduto();
    }

    @Override
    public String informarDescricaoProduto() {
        return veiculoDecorator.informarDescricaoProduto();
    }
}
