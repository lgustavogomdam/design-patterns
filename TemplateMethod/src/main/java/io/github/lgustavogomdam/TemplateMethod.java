package io.github.lgustavogomdam;

/**
 * @author lgustavogomdam
 */
public class TemplateMethod {
    public static void main(String[] args) {

        //Definindo o modo de classificação
        TabelaBrasileirao tabela = new TabelaBrasileirao(ModoDeClassificacao.POR_PONTOS);

        //Adicionando times
        tabela.adicionarTime("Flamengo", 60, 49, 17);
        tabela.adicionarTime("Palmeiras", 58, 46, 19);
        tabela.adicionarTime("Corinthians", 55, 40, 16);
        tabela.adicionarTime("São Paulo", 50, 38, 14);
        tabela.adicionarTime("Grêmio", 47, 35, 13);
        tabela.adicionarTime("Internacional", 45, 33, 12);
        tabela.adicionarTime("Santos", 43, 36, 11);
        tabela.adicionarTime("Atlético Mineiro", 40, 34, 10);
        tabela.adicionarTime("Fluminense", 38, 30, 9);
        tabela.adicionarTime("Vasco da Gama", 35, 28, 8);

        // Exibindo a tabela por pontos
        System.out.println("\n=== Tabela por Pontos ===");
        tabela.mostrarTabelaClassificacao();

        //Alterando o modo de classificação
        tabela.setModoDeClassificacao(ModoDeClassificacao.POR_GOLS);
        System.out.println("\n=== Tabela por Gols ===");
        tabela.mostrarTabelaClassificacao();

        //Alterando o modo de classificação
        tabela.setModoDeClassificacao(ModoDeClassificacao.POR_VITORIAS);
        System.out.println("\n=== Tabela por Vitórias ===");
        tabela.mostrarTabelaClassificacao();

        //Alterando o modo de classificação
        tabela.setModoDeClassificacao(ModoDeClassificacao.POR_TIME);
        System.out.println("\n=== Tabela por nome de Times ===");
        tabela.mostrarTabelaClassificacao();
    }
}
