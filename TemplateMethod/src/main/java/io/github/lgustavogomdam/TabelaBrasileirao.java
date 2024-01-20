package io.github.lgustavogomdam;

import io.github.lgustavogomdam.ordenadores.*;

import java.util.ArrayList;

public class TabelaBrasileirao {
    private ArrayList<TimeFutebol> times;
    private OrdenadorTemplate ordenador;

    public TabelaBrasileirao(ModoDeClassificacao modo) {
        times = new ArrayList<TimeFutebol>();
        setModoDeClassificacao(modo);
    }

    public void setModoDeClassificacao(ModoDeClassificacao modo) {
        switch (modo) {
            case POR_PONTOS:
                ordenador = new OrdenadorPorPontos();
                break;
            case POR_GOLS:
                ordenador = new OrdenadorPorGols();
                break;
            case POR_VITORIAS:
                ordenador = new OrdenadorPorVitorias();
                break;
            case POR_TIME:
                ordenador = new OrdenadorPorTime();
                break;
            default:
                break;
        }
    }

    public void adicionarTime(String nome, int pontos, int gols, int vitorias) {
        times.add(new TimeFutebol(nome, pontos, gols, vitorias));
    }

    public void mostrarTabelaClassificacao() {
        ArrayList<TimeFutebol> novaLista = ordenador.ordenarTimes(times);
        for (TimeFutebol time : novaLista) {
            System.out.println(time);
        }
    }
}
