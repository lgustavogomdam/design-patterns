package io.github.lgustavogomdam.fabricas;

import io.github.lgustavogomdam.carros.comum.Taycan_4S;
import io.github.lgustavogomdam.carros.premium._718_Cayman_GT4_RS;
import io.github.lgustavogomdam.interfaces.CarroComum;
import io.github.lgustavogomdam.interfaces.CarroPremium;
import io.github.lgustavogomdam.interfaces.FabricaGenerica;

public class FabricaPorsche implements FabricaGenerica {

	@Override
	public CarroComum criarCarroComum() {
		return new Taycan_4S();
	}

	@Override
	public CarroPremium criarCarroPremium() {
		return new _718_Cayman_GT4_RS();
	}
}
