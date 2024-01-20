package io.github.lgustavogomdam;

import io.github.lgustavogomdam.fabricas.FabricaPorsche;
import io.github.lgustavogomdam.fabricas.FabricaMaseratti;
import io.github.lgustavogomdam.interfaces.CarroComum;
import io.github.lgustavogomdam.interfaces.CarroPremium;
import io.github.lgustavogomdam.interfaces.FabricaGenerica;

/**
 * @author lgustavogomdam
*/
/*
* Nome: Abstract Factory

* Problema: Este padrão é usado quando há a necessidade de criar famílias de objetos relacionados sem especificar
  suas classes concretas.

* Solução: O Abstract Factory oferece uma interface para criar famílias de objetos relacionados ou dependentes
  sem especificar suas classes concretas. Permite que um sistema seja independente de como seus produtos são criados,
  compostos e representados.
*/
public class AbstractFactory {
    public static void main(String[] args) {

        System.out.println("""
                \n===========| Implementação do Factory Method |===========
                """);

        //Definição das fabricas genericas
        FabricaGenerica fabrica;
        CarroComum carroComum;
        CarroPremium carroPremium;

        System.out.println("""
                \n===========| Porsche |===========
                """);
        //Uso da implementação da fabrica "Porsche" e dos carros comuns e premium correspondentes
        fabrica = new FabricaPorsche();
        carroComum = fabrica.criarCarroComum();
        carroPremium = fabrica.criarCarroPremium();
        carroComum.exibirInfo();
        System.out.println();
        carroPremium.exibirInfo();
        System.out.println();

        System.out.println("""
                \n===========| Maseratti |===========
                """);
        //Uso da implementação da fabrica "Maseratti" e dos carros comuns e premium correspondentes
        fabrica = new FabricaMaseratti();
        carroComum = fabrica.criarCarroComum();
        carroPremium = fabrica.criarCarroPremium();
        carroComum.exibirInfo();
        System.out.println();
        carroPremium.exibirInfo();
        System.out.println();

    }
}