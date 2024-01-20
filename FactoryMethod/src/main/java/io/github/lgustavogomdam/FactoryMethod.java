package io.github.lgustavogomdam;

import io.github.lgustavogomdam.fabricas.FabricaPorsche;
import io.github.lgustavogomdam.fabricas.FabricaMaseratti;
import io.github.lgustavogomdam.interfaces.CarroGenerico;
import io.github.lgustavogomdam.interfaces.FabricaGenerica;

/**
 * @author lgustavogomdam
*/
/*
* Nome: Factory Method

* Problema: O padrão Factory Method é usado quando há necessidade de criar objetos sem especificar a classe exata do
  objeto que será criado, permitindo maior flexibilidade e desacoplamento no design do software.

* Solução: A solução do Factory Method envolve a definição de uma interface para criar um objeto, mas deixa que as
  subclasses decidam qual classe instanciar. Isso permite que a lógica de criação do objeto seja adaptada sem alterar
  o código cliente.
*/
public class FactoryMethod {
    public static void main(String[] args) {

        System.out.println("""
                \n===========| Implementação do Factory Method |===========
                """);

        //Definição das fabricas genericas
        FabricaGenerica fabrica;
        CarroGenerico carro;

        //Uso da implementação da fabrica "Porsche" e do carro correspondente
        fabrica = new FabricaPorsche();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

        //Uso da implementação da fabrica "Maseratti" e do carro correspondente
        fabrica = new FabricaMaseratti();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println();

    }
}