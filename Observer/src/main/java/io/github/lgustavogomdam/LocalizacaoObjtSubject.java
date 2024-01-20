package io.github.lgustavogomdam;

import java.util.ArrayList;

public class LocalizacaoObjtSubject {
    
    protected ArrayList<LocalizacaoObjtObserver> observers;
    
    protected LocalizacaoObjetos coords;
    
    public LocalizacaoObjtSubject() {
        observers = new ArrayList<LocalizacaoObjtObserver>();
    }
    
    public void attach(LocalizacaoObjtObserver observer) {
        observers.add(observer);
    }
    
    public void detach(int indice) {
        observers.remove(indice);
    }
    
    public void setState(LocalizacaoObjetos coords) {
        this.coords = coords;
        notifyObservers();
    }
    
    private void notifyObservers() {
        for (LocalizacaoObjtObserver observer : observers) {
            observer.update();
        }
    }
    
    public LocalizacaoObjetos getState() {
        return this.coords;
    }
}
