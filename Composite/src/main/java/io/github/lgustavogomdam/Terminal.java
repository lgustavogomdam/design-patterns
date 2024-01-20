package io.github.lgustavogomdam;

public class Terminal extends ComponenteIDE {
    public Terminal(String nomeDoComponente) {
        super(nomeDoComponente);
    }

    @Override
    public void printNomeDoComponente() {
        System.out.println(this.nomeDoComponente + " - Terminal");
    }
}
