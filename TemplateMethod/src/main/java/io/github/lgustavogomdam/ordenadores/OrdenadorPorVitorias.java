package io.github.lgustavogomdam.ordenadores;

import io.github.lgustavogomdam.TimeFutebol;

public class OrdenadorPorVitorias extends OrdenadorTemplate {
    @Override
    public boolean isPrimeiro(TimeFutebol time1, TimeFutebol time2) {
        return time1.getVitorias() > time2.getVitorias();
    }
}
