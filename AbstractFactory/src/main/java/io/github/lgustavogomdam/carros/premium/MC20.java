package io.github.lgustavogomdam.carros.premium;

import io.github.lgustavogomdam.interfaces.CarroComum;
import io.github.lgustavogomdam.interfaces.CarroPremium;

public class MC20 implements CarroPremium {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: MC20\nFabricante: Maseratti\nTipo: Premium");
	}

}