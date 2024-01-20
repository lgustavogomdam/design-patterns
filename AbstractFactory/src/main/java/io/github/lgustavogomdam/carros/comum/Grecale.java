package io.github.lgustavogomdam.carros.comum;

import io.github.lgustavogomdam.interfaces.CarroComum;

public class Grecale implements CarroComum {
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Grecale\nFabricante: Maseratti\nTipo: Comum");
    }
}
