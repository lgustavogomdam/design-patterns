package io.github.lgustavogomdam.InterfaceState;

import io.github.lgustavogomdam.Classe.Pagamento;

public interface PagamentoState {
    public double calcularValorFinal(double valor, Pagamento pag, int parcelas);
    public void mostrarValorFinal(double valor, double juros, int parcelas);
}
