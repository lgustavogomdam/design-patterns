package io.github.lgustavogomdam.Carros;

import io.github.lgustavogomdam.Interfaces.ExecutarMotor;

public class Pontiac extends Carro {
    
    public Pontiac(ExecutarMotor motorEX) {
        super(motorEX);
    }

    @Override
    public void funcionarCarro(int quantidadeFaisca) {
        darPartida(quantidadeFaisca);
    }
}
