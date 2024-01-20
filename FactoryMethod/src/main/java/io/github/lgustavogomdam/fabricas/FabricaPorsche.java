package io.github.lgustavogomdam.fabricas;

import io.github.lgustavogomdam.carros.Taycan4S;
import io.github.lgustavogomdam.interfaces.CarroGenerico;
import io.github.lgustavogomdam.interfaces.FabricaGenerica;

public class FabricaPorsche implements FabricaGenerica {

	@Override
	public CarroGenerico criarCarro() {
		return new Taycan4S();
	}

}
