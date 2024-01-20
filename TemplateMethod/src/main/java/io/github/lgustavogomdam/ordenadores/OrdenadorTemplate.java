package io.github.lgustavogomdam.ordenadores;

import io.github.lgustavogomdam.TimeFutebol;

import java.util.ArrayList;

public abstract class OrdenadorTemplate {
    public abstract boolean isPrimeiro(TimeFutebol time1, TimeFutebol time2);

    public ArrayList<TimeFutebol> ordenarTimes(ArrayList<TimeFutebol> lista) {
        ArrayList<TimeFutebol> novaLista = new ArrayList<TimeFutebol>(lista);
        for (int i = 0; i < novaLista.size(); i++) {
            for (int j = i; j < novaLista.size(); j++) {
                if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {
                    TimeFutebol temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }
        return novaLista;
    }
}
