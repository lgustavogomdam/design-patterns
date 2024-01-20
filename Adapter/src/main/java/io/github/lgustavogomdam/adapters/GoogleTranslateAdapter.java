package io.github.lgustavogomdam.adapters;

import io.github.lgustavogomdam.APIs.GoogleTranslate;
import io.github.lgustavogomdam.interfaces.TextConverter;

public class GoogleTranslateAdapter extends GoogleTranslate implements TextConverter {

	@Override
	public String formatarTexto(String texto) {
		return super.googleFormatText(texto);
	}

	@Override
	public String traduzirTexto(String texto) {
		return super.googleTextTranslate(texto);
	}
}
