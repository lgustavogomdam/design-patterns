package io.github.lgustavogomdam.APIs;

public class MicrosoftTranslate {
	public String microsoftFormatText(String texto) {
		return texto.toLowerCase();
	}
	public String microsoftTextTranslate(String texto) {
		if (texto.equals("Olá Mundo!")){
			return "¡Hola Mundo!";
		}else{
			return "Tradução não encontrada!";
		}
	}
}

