package io.github.lgustavogomdam.Motores;

import io.github.lgustavogomdam.Interfaces.ExecutarMotor;
import io.github.lgustavogomdam.Interfaces.LigarIgnicao;

public class MotorV8 implements LigarIgnicao, ExecutarMotor{
    
    @Override
    public boolean movimentarPistoes(boolean fezFaisca) {
        
        if(fezFaisca){
            System.out.println("Movimentando Pistoes");
            return true;
        }else
            return false;
        
    }
    
    @Override
    public boolean fazerFaisca(int quantidadeFaisca) {
        if(quantidadeFaisca > 7){
            System.out.println("Faísca produzida com sucesso");
            movimentarPistoes(true);
            return true;
        }else{
            System.out.println("Falha nos pistoes, faísca não concluida");
            return false;
        }
    }

    @Override
    public void movimentar(boolean ligouMotor) {
        System.out.println("Motor ligado, pronto para andar");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Ligando motor");
        movimentar(true);
    }
}
