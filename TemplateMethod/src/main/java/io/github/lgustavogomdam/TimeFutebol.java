package io.github.lgustavogomdam;

public class TimeFutebol {
    private String nome;
    private int pontos;
    private int gols;
    private int vitorias;

    public TimeFutebol(String nome, int pontos, int gols, int vitorias) {
        this.nome = nome;
        this.pontos = pontos;
        this.gols = gols;
        this.vitorias = vitorias;
    }

    @Override
    public String toString() {
        return "| " + nome + " | Pontos: " + pontos + " | Gols: " + gols + " | Vitórias: " + vitorias + " |";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}
