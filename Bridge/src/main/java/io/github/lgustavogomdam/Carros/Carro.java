package io.github.lgustavogomdam.Carros;

import io.github.lgustavogomdam.Interfaces.ExecutarMotor;
import io.github.lgustavogomdam.Interfaces.LigarIgnicao;

public abstract class Carro {
    //escolhi classe abstrata pois como terei mais de um tipo de carro,
    //é interessante que seus atributos comuns sejam passados para as filhas
    
    //implemento os atributos do tipo interface necessários para o funcionamento do carro
    protected ExecutarMotor motor;
    protected LigarIgnicao ignicao;

    public Carro(ExecutarMotor motorEX) {
        this.ignicao = (LigarIgnicao) motorEX;
        this.motor = motorEX;
    }

    public void darPartida(int quantidadeFaisca) {
        if(ignicao.fazerFaisca(quantidadeFaisca)){
            motor.ligarMotor();
        }else
            System.out.println("Falha na partida");
     
    }

    
    public abstract void funcionarCarro(int quantidadeFaisca);
}
