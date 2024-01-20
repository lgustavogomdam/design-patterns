package io.github.lgustavogomdam;

/**
 *
 * @author lgustavogomdam
 */
public class CalculaSalarioFrontEMobile implements CalculaSalario {
    
    public double calculaSalario(Desenvolvedor funcionario){
        
        if(funcionario.getApps_webAppsDesenvolvidos() >= 5)
            return (funcionario.getSalarioBase() * 0.35)+ funcionario.getSalarioBase();
        else
            return (funcionario.getSalarioBase() * 0.15)+ funcionario.getSalarioBase();
    }
}
