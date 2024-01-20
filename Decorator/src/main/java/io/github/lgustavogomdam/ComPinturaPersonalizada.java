package io.github.lgustavogomdam;

public class ComPinturaPersonalizada extends ProdutoDecorator {
    public ComPinturaPersonalizada(Decorator veiculo) {
        super(veiculo);
    }

    @Override
    public Double informarPrecoProduto() {
        return super.informarPrecoProduto() + 3000.0; // Custo da pintura personalizada
    }

    @Override
    public String informarDescricaoProduto() {
        return super.informarDescricaoProduto() + ", além disso, possui pintura personalizada ao gosto do cliente.";
    }
}
