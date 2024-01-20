# Projeto Factory Method para Carros

## Descrição
Este projeto em Java implementa o padrão Factory Method para criar diferentes modelos de carros. O padrão é utilizado para abstrair a lógica de criação dos carros, permitindo maior flexibilidade e desacoplamento.

## Funcionalidades
- **Fábricas de Carros**: Criação de carros através de fábricas específicas (`FabricaPorsche`, `FabricaMaseratti`).
- **Carros Disponíveis**:
    - **Porsche Taycan 4S**: Criação de um modelo Taycan 4S.
    - **Maseratti MC20**: Criação de um modelo MC20.

## Como Usar
Para usar o projeto, crie uma instância da fábrica desejada (`FabricaPorsche` ou `FabricaMaseratti`) e utilize o método `criarCarro`.

## Exemplo
```java
FabricaGenerica fabrica = new FabricaPorsche();
CarroGenerico carro = fabrica.criarCarro();
carro.exibirInfo();
```

## Tecnologias Utilizadas
- Java

---

Projeto desenvolvido para demonstrar o uso do padrão Factory Method em Java, ideal para compreender a aplicabilidade e flexibilidade desse padrão em design de software.