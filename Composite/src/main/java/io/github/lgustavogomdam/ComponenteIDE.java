package io.github.lgustavogomdam;

public abstract class ComponenteIDE {
    protected String nomeDoComponente;
    public ComponenteIDE(String nomeDoComponente) {
        this.nomeDoComponente = nomeDoComponente;
    }
    public String getNomeDoComponente() {
        return nomeDoComponente;
    }
    public void printNomeDoComponente() {
        System.out.println(this.nomeDoComponente);
    }
    public void adicionar(ComponenteIDE novoComponente) throws Exception {
        throw new Exception("Não pode inserir componentes em: "
                + this.nomeDoComponente + " - Não é uma IDE");
    }
    public void remover(String nomeDoComponente) throws Exception {
        throw new Exception("Não pode remover componentes em: "
                + this.nomeDoComponente + " - Não é uma IDE");
    }
    public ComponenteIDE obterComponente(String nomeDoComponente) throws Exception {
        throw new Exception("Não pode pesquisar componentes em: "
                + this.nomeDoComponente + " - Não é uma IDE");
    }
}
