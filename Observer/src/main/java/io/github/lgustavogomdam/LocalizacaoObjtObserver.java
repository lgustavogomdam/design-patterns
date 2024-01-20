package io.github.lgustavogomdam;

public abstract class LocalizacaoObjtObserver {
    
    protected LocalizacaoObjtSubject coords;

    public LocalizacaoObjtObserver(LocalizacaoObjtSubject coords) {
        this.coords = coords;
    }
    
    public abstract void update();
}

