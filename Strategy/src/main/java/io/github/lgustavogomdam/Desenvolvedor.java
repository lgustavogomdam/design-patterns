
package io.github.lgustavogomdam;

/**
 *
 * @author lgustavogomdam
 */
public class Desenvolvedor {

    //Definindo tipos de Desenvolvedor
    public static final int DESENVOLVEDOR_BACKEND = 1;
    public static final int DESENVOLVEDOR_FRONTEND = 2;
    public static final int DESENVOLVEDOR_MOBILE = 3;

    //Variaveis comuns
    protected double salarioBase;
    protected int tipoDesenvolvedor;

    //Variaveis de parâmetro para o cálculo
    protected int apps_webAppsDesenvolvidos;
    protected int APIsDesenvolvidas;

    //Variavel que define a estrategia de cálculo para cada um deles
    protected CalculaSalario estrategiaCalculo;

    public Desenvolvedor(int tipoDesenvolvedor, double salarioBase){
        
        this.salarioBase = salarioBase;

        //Definindo a estrategia de calculo com base no tipo do desenvolvedor
        switch(tipoDesenvolvedor){
            
            case DESENVOLVEDOR_BACKEND:
                this.estrategiaCalculo = new CalculaSalarioBackend();
                this.tipoDesenvolvedor = DESENVOLVEDOR_BACKEND;
            break;
            
            case DESENVOLVEDOR_MOBILE:
                estrategiaCalculo = new CalculaSalarioFrontEMobile();
                tipoDesenvolvedor = DESENVOLVEDOR_MOBILE;

            break;
            
            case DESENVOLVEDOR_FRONTEND:
                estrategiaCalculo = new CalculaSalarioFrontEMobile();
                tipoDesenvolvedor = DESENVOLVEDOR_FRONTEND;
            break;
            
            default:
                throw new RuntimeException("Modelo não encontrado!\n");
        }
    }
    
    public double calcularBonusDeSalarioComBaseEmProjetos(){
        return estrategiaCalculo.calculaSalario(this);
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }

    public int getApps_webAppsDesenvolvidos() {
        return this.apps_webAppsDesenvolvidos;
    }

    public void setApps_webAppsDesenvolvidos(int apps_webAppsDesenvolvidos) {
        this.apps_webAppsDesenvolvidos = apps_webAppsDesenvolvidos;
    }

    public int getAPIsDesenvolvidas() {
        return this.APIsDesenvolvidas;
    }

    public void setAPIsDesenvolvidas(int APIsDesenvolvidas) {
        this.APIsDesenvolvidas = APIsDesenvolvidas;
    }
}
