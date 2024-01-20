package io.github.lgustavogomdam;

import io.github.lgustavogomdam.adapters.GoogleTranslateAdapter;
import io.github.lgustavogomdam.adapters.MicrosoftTranslateAdapter;
import io.github.lgustavogomdam.interfaces.TextConverter;

/**
 *
 * @author lgustavogomdam
 */
/*
* Nome: Adapter

* Problema: O padrão Adapter é usado para permitir que duas interfaces incompatíveis trabalhem juntas, resolvendo
  problemas de incompatibilidade sem alterar a lógica existente.

* Solução: O Adapter funciona como um intermediário, conectando uma interface (classe) existente a outra, permitindo
  que comuniquem sem modificar seus códigos originais. Isso é útil quando se integra novos componentes ou bibliotecas
  a sistemas existentes.
*/
public class PadraoAdapter {
    public static void main(String[] args) {

		System.out.println("""
			\n=================| Implementação do Padrão Adapter |=================
			""");
		System.out.println("""
			\n=================| Simulação de API ( Microsoft )
			""");
		//Instanciando uma Api especifica e usado metodos
		TextConverter textConverter = new MicrosoftTranslateAdapter();
		System.out.println(textConverter.formatarTexto("Teste de formatação"));
		System.out.println(textConverter.traduzirTexto("Olá Mundo!"));

		System.out.println("""
			\n=================| Simulação de API ( Google )
			""");
		textConverter = new GoogleTranslateAdapter();
		System.out.println(textConverter.formatarTexto("Teste de formatação"));
		System.out.println(textConverter.traduzirTexto("Olá Mundo!"));

    }
}
