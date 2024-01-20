package io.github.lgustavogomdam;

// Definição da classe Conexao seguindo o padrão Singleton
public class Conexao {

    // Atributo privado que armazena a única instância da classe
    private static Conexao conexao;

    // Atributo de exemplo para representar algum dado da conexão
    private String nome_conexao;

    // Construtor privado para evitar instanciação externa
    private Conexao(){
        this.nome_conexao = "Conexão não informada ou definida";
    }

    // Método público estático que retorna a única instância da classe
    public static Conexao getInstance(){
        // Se a instância é null, cria uma nova. Caso contrário, retorna a existente garantindo que tenha
        // apenas uma instancia da classe
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }

    public String getNome_conexao() {
        return this.nome_conexao;
    }

    public void setNome_conexao(String nome_conexao) {
        this.nome_conexao = nome_conexao;
    }
}
