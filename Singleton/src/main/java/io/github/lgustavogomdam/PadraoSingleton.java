package io.github.lgustavogomdam;

/**
 * Nome: Singleton

 * Problema: O padrão Singleton é utilizado quando é necessário garantir que uma classe tenha apenas uma única instância,
 com acesso global.

 * Solução: O Singleton resolve isso com um construtor privado para evitar múltiplas instâncias e um método estático que
 retorna a única instância da classe. Isso assegura um único ponto de acesso global à instância.
**/
// Classe principal para testar o padrão Singleton
public class PadraoSingleton {
    public static void main(String[] args) {

        // Obtenção da única instância de Conexao
        Conexao conexao1 = Conexao.getInstance();
        Conexao conexao2 = Conexao.getInstance();

        // Modificação da instância única através de uma das referências
        conexao1.setNome_conexao("Conexão com MySQL");

        // Exibição do nome da conexão por ambas as referências - deve ser igual
        System.out.println("Instancia 1: " + conexao1.getNome_conexao());
        System.out.println("Instancia 2: " + conexao2.getNome_conexao());

        // Modificação da instância única através de uma das referências
        conexao2.setNome_conexao("Conexão com PostgreSQL");

        // Exibição do nome da conexão por ambas as referências - deve ser igual
        System.out.println("Instancia 1: " + conexao1.getNome_conexao());
        System.out.println("Instancia 2: " + conexao2.getNome_conexao());

        // Exibição das referências das variáveis - devem apontar para o mesmo objeto
        System.out.println("Instancia 1: " + conexao1);
        System.out.println("Instancia 2: " + conexao2);
    }
}