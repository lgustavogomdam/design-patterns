package io.github.lgustavogomdam;

/**
 * @author lgustavogomdam
 */
/*
* Nome: Strategy

* Problema: O padrão Strategy é usado quando se quer permitir que o comportamento de uma classe seja selecionado em
  tempo de execução. Ele é ideal para situações onde diferentes variantes de um algoritmo ou comportamento podem ser
  necessárias.

* Solução: A solução Strategy envolve definir uma família de algoritmos, encapsulando cada um como um objeto e
  tornando-os intercambiáveis. Isso permite que o algoritmo varie independentemente dos clientes que o utilizam,
  proporcionando flexibilidade e reutilização do código.
*/
//Definição da classe de teste do strategy
public class PadraoStrategy {
    public static void main(String[] args) {

        System.out.println("""
                \n===========|Implementação do Padrão Strategy|===========
                """);

        //Definindo abaixo o tipo de um funcionario para que o calculo de Bonus de salário seja feito especificamente
        // para cada um deles

        Desenvolvedor funcionario1 = new Desenvolvedor(Desenvolvedor.DESENVOLVEDOR_BACKEND,2500);
        funcionario1.setAPIsDesenvolvidas(4);
        System.out.println("O salário do Funcionário 1 é: " + funcionario1.calcularBonusDeSalarioComBaseEmProjetos());

        Desenvolvedor funcionario2 = new Desenvolvedor(Desenvolvedor.DESENVOLVEDOR_MOBILE,2150);
        funcionario2.setApps_webAppsDesenvolvidos(4);
        System.out.println("O salário do Funcionário 2 é: " + funcionario2.calcularBonusDeSalarioComBaseEmProjetos());

        Desenvolvedor funcionario3 = new Desenvolvedor(Desenvolvedor.DESENVOLVEDOR_FRONTEND,2150);
        funcionario3.setApps_webAppsDesenvolvidos(6);
        System.out.println("O salário do Funcionário 3 é: " + funcionario3.calcularBonusDeSalarioComBaseEmProjetos());


    }
}