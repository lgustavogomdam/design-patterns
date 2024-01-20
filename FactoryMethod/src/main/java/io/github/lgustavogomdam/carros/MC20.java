package io.github.lgustavogomdam.carros;

import io.github.lgustavogomdam.interfaces.CarroGenerico;

public class MC20 implements CarroGenerico
{

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: MC20\nFabricante: Maseratti");
	}

}