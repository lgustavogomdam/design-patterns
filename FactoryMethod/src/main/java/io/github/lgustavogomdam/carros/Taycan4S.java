package io.github.lgustavogomdam.carros;

import io.github.lgustavogomdam.interfaces.CarroGenerico;

public class Taycan4S implements CarroGenerico
{
	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Taycan 4S\nFabricante: Porsche");
	}
}
