# Tabela do Brasileirão - Padrão Template Method

## Sobre o Projeto

Este projeto implementa o padrão de design Template Method para organizar uma tabela do campeonato brasileiro de futebol (Brasileirão). Utilizando o conceito de ordenação baseada em diferentes critérios (como pontos, gols e vitórias), o projeto demonstra a flexibilidade e a reutilização de código proporcionadas pelo padrão Template Method.

### Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- `TabelaBrasileirao`: Gerencia a lista de times e a ordenação com base no modo de classificação selecionado.
- `TimeFutebol`: Representa um time de futebol com atributos como nome, pontos, gols e vitórias.
- `OrdenadorTemplate`: Classe abstrata que define o template para as subclasses de ordenação.
- Subclasses de `OrdenadorTemplate` (`OrdenadorPorPontos`, `OrdenadorPorGols`, `OrdenadorPorVitorias`, `OrdenadorPorTime`): Implementam o método `isPrimeiro` para ordenar os times de acordo com diferentes critérios.
- `ModoDeClassificacao`: Enumeração que define os modos de classificação disponíveis.

### Utilização

Para utilizar o sistema, crie uma instância de `TabelaBrasileirao`, adicione os times com seus respectivos dados e escolha o modo de classificação para exibir a tabela. Exemplo:

```java
TabelaBrasileirao tabela = new TabelaBrasileirao(ModoDeClassificacao.POR_PONTOS);
tabela.adicionarTime("Flamengo", 58, 45, 17);
// Adicionar mais times...
tabela.mostrarTabelaClassificacao();
```

## Padrão Template Method

O padrão Template Method é utilizado neste projeto para definir o esqueleto do algoritmo de ordenação na superclasse `OrdenadorTemplate`, enquanto permite que suas subclasses alterem alguns passos do algoritmo sem mudar sua estrutura.

### Vantagens

- Facilita a reutilização de código e a manutenção.
- Promove a extensibilidade ao permitir novas formas de ordenação sem alterar a classe principal.
- Encapsula o código que varia, deixando as subclasses livres para implementar comportamentos específicos.

### Linguagem

- Java