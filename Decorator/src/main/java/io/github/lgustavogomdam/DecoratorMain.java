package io.github.lgustavogomdam;

public class DecoratorMain {
    public static void imprimirInformacao(Decorator veiculo) {
        System.out.println("O preço do veículo é: R$" + veiculo.informarPrecoProduto());
        System.out.println(veiculo.informarDescricaoProduto());
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Decorator veiculo = new Veiculo();
        imprimirInformacao(veiculo);

        veiculo = new ComSistemaDeSom(veiculo);
        imprimirInformacao(veiculo);

        veiculo = new Veiculo();
        veiculo = new ComPinturaPersonalizada(veiculo);
        imprimirInformacao(veiculo);
    }
}
