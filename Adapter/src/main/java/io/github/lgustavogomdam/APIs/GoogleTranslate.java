package io.github.lgustavogomdam.APIs;

public class GoogleTranslate {
	public String googleFormatText(String texto) {
		return texto.toUpperCase();
	}
	public String googleTextTranslate(String texto) {
		if (texto.equals("Olá Mundo!")){
			return "Hello World!";
		}else{
			return "Tradução não encontrada!";
		}
	}
}
