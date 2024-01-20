package io.github.lgustavogomdam.Carros;

import io.github.lgustavogomdam.Interfaces.ExecutarMotor;

public class DodgeCharger extends Carro {

    public DodgeCharger(ExecutarMotor motorEX) {
        super(motorEX);
    }

    @Override
    public void funcionarCarro(int quantidadeFaisca) {
        darPartida(quantidadeFaisca);
    }

}
