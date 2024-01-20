package io.github.lgustavogomdam.carros.comum;

import io.github.lgustavogomdam.interfaces.CarroComum;

public class Taycan_4S implements CarroComum {
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Taycan 4S\nFabricante: Porsche\nTipo: Comum");
    }
}
