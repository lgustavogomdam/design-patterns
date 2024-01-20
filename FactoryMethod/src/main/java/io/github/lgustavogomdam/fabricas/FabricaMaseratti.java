package io.github.lgustavogomdam.fabricas;

import io.github.lgustavogomdam.carros.MC20;
import io.github.lgustavogomdam.interfaces.CarroGenerico;
import io.github.lgustavogomdam.interfaces.FabricaGenerica;

public class FabricaMaseratti implements FabricaGenerica {

	@Override
	public CarroGenerico criarCarro() {
		return new MC20();
	}

}
