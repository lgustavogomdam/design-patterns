package io.github.lgustavogomdam.adapters;

import io.github.lgustavogomdam.APIs.MicrosoftTranslate;
import io.github.lgustavogomdam.interfaces.TextConverter;

public class MicrosoftTranslateAdapter extends MicrosoftTranslate implements TextConverter {

	@Override
	public String formatarTexto(String texto) {
		return super.microsoftFormatText(texto);
	}

	@Override
	public String traduzirTexto(String texto) {
		return super.microsoftTextTranslate(texto);
	}
}
