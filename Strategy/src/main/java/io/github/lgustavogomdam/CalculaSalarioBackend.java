package io.github.lgustavogomdam;

/**
 *
 * @author lgustavogomdam
 */
public class CalculaSalarioBackend implements CalculaSalario {
    
    public double calculaSalario(Desenvolvedor funcionario){
        
        if(funcionario.getAPIsDesenvolvidas() >= 3)
            return (funcionario.getSalarioBase() * 0.65)+ funcionario.getSalarioBase();
        else
            return (funcionario.getSalarioBase() * 0.35)+ funcionario.getSalarioBase();
    }
    
}
