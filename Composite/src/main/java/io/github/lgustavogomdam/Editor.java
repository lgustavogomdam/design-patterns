package io.github.lgustavogomdam;

public class Editor extends ComponenteIDE {

    public Editor(String nomeDoComponente) {
        super(nomeDoComponente);
    }

    @Override
    public void printNomeDoComponente() {
        System.out.println(this.nomeDoComponente + " - Editor");
    }
}
