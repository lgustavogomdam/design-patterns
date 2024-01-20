package io.github.lgustavogomdam.ordenadores;

import io.github.lgustavogomdam.TimeFutebol;

public class OrdenadorPorTime extends OrdenadorTemplate {
    @Override
    public boolean isPrimeiro(TimeFutebol time1, TimeFutebol time2) {
        return time1.getNome().compareToIgnoreCase(time2.getNome()) <= 0;
    }
}
