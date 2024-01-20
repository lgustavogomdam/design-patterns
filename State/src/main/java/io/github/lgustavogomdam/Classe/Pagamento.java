package io.github.lgustavogomdam.Classe;

import io.github.lgustavogomdam.States.Dinheiro;
import io.github.lgustavogomdam.InterfaceState.PagamentoState;

public class Pagamento {
    
    private PagamentoState statePagamento;

    private double valor;
    private double juros;
    private int parcelas;

    //Constructor
    
    public Pagamento(double valor,int parcelas) {
        statePagamento = new Dinheiro();
        
        this.juros = 0.0;
        this.valor = valor;
        this.parcelas = parcelas;
    }

    //Getter's & Setter's
    
    public PagamentoState getStatePagamento() {
        return this.statePagamento;
    }

    public void setStatePagamento(PagamentoState statePagamento) {
        this.statePagamento = statePagamento;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return this.juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public int getParcelas() {
        return this.parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
    //Methods
    
    public void calcularValorFinal() {
        this.valor = statePagamento.calcularValorFinal(this.valor, this, this.parcelas);
    }
    public void mostrarValorFinal() {
        statePagamento.mostrarValorFinal(this.valor, this.juros, this.parcelas);
    }
}
