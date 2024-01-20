# Projeto Decorator para Veículos

## Descrição
Este projeto implementa o padrão Decorator em Java para demonstrar a customização de veículos. Utilizando este padrão, o projeto permite adicionar características adicionais a um veículo base, como sistema de som e pintura personalizada, de forma dinâmica e flexível.

## Funcionalidades
- **Veículo Básico**: Criação de um objeto veículo com características padrão.
- **Decorações Disponíveis**:
    - **Sistema de Som**: Adiciona um sistema de som de alta qualidade ao veículo.
    - **Pintura Personalizada**: Permite personalizar a pintura do veículo.

## Como Usar
Para usar o projeto, crie uma instância do veículo e adicione as decorações desejadas utilizando os decoradores `ComSistemaDeSom` e `ComPinturaPersonalizada`.

## Exemplo
```java
Decorator veiculo = new Veiculo();
veiculo = new ComSistemaDeSom(veiculo);
veiculo = new ComPinturaPersonalizada(veiculo);
```

## Tecnologias Utilizadas
- Java

---

Projeto desenvolvido para ilustrar o uso do padrão Decorator em um contexto de customização de veículos. Ideal para compreender a aplicabilidade e a flexibilidade do padrão Decorator em design de software.