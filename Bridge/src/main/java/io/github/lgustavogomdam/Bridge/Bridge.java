package io.github.lgustavogomdam.Bridge;

import io.github.lgustavogomdam.Motores.MotorV8;
import io.github.lgustavogomdam.Motores.MotorV6;
import io.github.lgustavogomdam.Carros.Pontiac;
import io.github.lgustavogomdam.Carros.Carro;
import io.github.lgustavogomdam.Carros.DodgeCharger;

public class Bridge {

    public static void main(String[] args) {
        
        //Para motor V8 funcionar a quantidade de faiscas deve ser igual ou superior a 7 (funcionarCarro())
        //Para motor V6 funcionar a quantidade de faiscas deve ser igual ou superior a 3 (funcionarCarro())
        
        System.out.println("\n----------------------------------------------------");
        System.out.println("-------------|Dodge Charger - motor V8|-------------\n");
        Carro carro = new DodgeCharger(new MotorV8());
        carro.funcionarCarro(8);
        
        System.out.println("\n----------------------------------------------------");
        System.out.println("----------------|Pontiac - motor V8|----------------\n");
        carro = new Pontiac(new MotorV8());
        carro.funcionarCarro(3);
        
        System.out.println("\n----------------------------------------------------");
        System.out.println("-------------|Dodge Charger - motor V6|-------------\n");
        carro = new DodgeCharger(new MotorV6());
        carro.funcionarCarro(4);
        
    }
}
