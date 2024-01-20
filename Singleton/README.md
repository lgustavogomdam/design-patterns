# Projeto Singleton para Conexões

## Descrição
Este projeto implementa o padrão Singleton em Java para gerenciar conexões. O padrão Singleton garante que apenas uma única instância da classe `Conexao` seja criada, proporcionando um ponto de acesso global e gerenciamento centralizado para conexões, como banco de dados ou serviços externos.

## Funcionalidades
- **Instância Única**: Criação e gerenciamento de uma única instância da conexão.
- **Acesso Global**: Ponto de acesso global para a instância da conexão.

## Como Usar
Para utilizar a conexão, invoque o método `Conexao.getInstance()`. Este método assegura que a mesma instância seja usada em toda a aplicação.

## Exemplo
```java
Conexao conexao1 = Conexao.getInstance();
conexao1.setNome_conexao("Conexão com MySQL");
System.out.println(conexao1.getNome_conexao());
```

## Tecnologias Utilizadas
- Java

---

Projeto desenvolvido para demonstrar o uso eficiente do padrão Singleton em situações onde é necessário garantir uma única instância de um objeto, como em conexões de banco de dados ou configurações de sistema.

Este projeto é ideal para entender a implementação e aplicabilidade do padrão Singleton em design de software.