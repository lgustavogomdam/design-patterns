package io.github.lgustavogomdam.fabricas;

import io.github.lgustavogomdam.carros.comum.Grecale;
import io.github.lgustavogomdam.carros.premium.MC20;
import io.github.lgustavogomdam.interfaces.CarroComum;
import io.github.lgustavogomdam.interfaces.CarroPremium;
import io.github.lgustavogomdam.interfaces.FabricaGenerica;

public class FabricaMaseratti implements FabricaGenerica {

	@Override
	public CarroComum criarCarroComum() {
		return new Grecale();
	}

	@Override
	public CarroPremium criarCarroPremium() {
		return new MC20();
	}
}
