package io.github.lgustavogomdam.ordenadores;

import io.github.lgustavogomdam.TimeFutebol;

public class OrdenadorPorGols extends OrdenadorTemplate {
    @Override
    public boolean isPrimeiro(TimeFutebol time1, TimeFutebol time2) {
        return time1.getGols() > time2.getGols();
    }
}
