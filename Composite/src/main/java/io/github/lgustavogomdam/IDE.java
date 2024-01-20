package io.github.lgustavogomdam;

import java.util.ArrayList;

public class IDE extends ComponenteIDE {
    protected ArrayList<ComponenteIDE> componentes;

    public IDE(String nomeDoComponente) {
        super(nomeDoComponente);
        this.componentes = new ArrayList<>();
    }

    @Override
    public void printNomeDoComponente() {
        System.out.println(this.nomeDoComponente);
        componentes.forEach((componente) -> {
            componente.printNomeDoComponente();
        });
    }

    @Override
    public void adicionar(ComponenteIDE novoComponente) {
        this.componentes.add(novoComponente);
    }

    @Override
    public void remover(String nomeDoComponente) throws Exception {
        for (ComponenteIDE componente : componentes) {
            if (componente.getNomeDoComponente().equals(nomeDoComponente)) {
                this.componentes.remove(componente);
                return;
            }
        }
        throw new Exception("Não existe este componente");
    }

    @Override
    public ComponenteIDE obterComponente(String nomeDoComponente) throws Exception {
        for (ComponenteIDE componente : componentes) {
            if (componente.getNomeDoComponente().equals(nomeDoComponente)) {
                return componente;
            }
        }
        throw new Exception("Não existe este componente");
    }
}
