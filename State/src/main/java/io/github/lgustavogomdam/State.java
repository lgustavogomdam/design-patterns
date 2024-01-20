package io.github.lgustavogomdam;

import io.github.lgustavogomdam.Classe.Pagamento;
import io.github.lgustavogomdam.States.*;

/**
 * @author lgustavogomdam
*/
public class State {
    public static void main(String[] args) {
        
        //Pagamento padrão - Dinheiro
        System.out.println("\nPagamento padrão - Dinheiro");
        Pagamento novoPagamento = new Pagamento(100.00,1);

        novoPagamento.calcularValorFinal();
        novoPagamento.mostrarValorFinal();
        
        //Mudança de estado - Cartão (5 parcelas)
        System.out.println("\nMudança de estado - Cartão (5 parcelas)");
        novoPagamento.setParcelas(5);
        novoPagamento.setStatePagamento(new Cartao());
        
        novoPagamento.calcularValorFinal();
        novoPagamento.mostrarValorFinal();
        
        //Mudança de estado - PIX (1 parcela)
        System.out.println("\nMudança de estado - PIX (1 parcela)");
        novoPagamento.setParcelas(1);
        novoPagamento.setStatePagamento(new PIX());
        
        novoPagamento.calcularValorFinal();
        novoPagamento.mostrarValorFinal();
        
        //Mudança de estado - TED (1 parcela)
        System.out.println("\nMudança de estado - TED (1 parcela)");
        novoPagamento.setStatePagamento(new TED());
        
        novoPagamento.calcularValorFinal();
        novoPagamento.mostrarValorFinal();
    }
}
