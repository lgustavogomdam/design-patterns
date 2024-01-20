# Projeto Strategy para Desenvolvedores

## Descrição
Este projeto implementa o padrão Strategy em Java, demonstrando como diferentes comportamentos de cálculo de bônus podem ser aplicados a diferentes tipos de desenvolvedores. É um exemplo prático de como alterar o comportamento de uma classe em tempo de execução, proporcionando flexibilidade e reutilização de código.

## Funcionalidades
- **Tipos de Desenvolvedor**: Backend, Frontend, Mobile.
- **Cálculo de Bônus**: Estratégias específicas para calcular o bônus com base no tipo de desenvolvedor e projetos concluídos.

## Como Usar
Crie uma instância de `Desenvolvedor` especificando o tipo. Utilize a estratégia correspondente para calcular o bônus com base em critérios específicos como `APIsDesenvolvidas` ou `Apps_webAppsDesenvolvidos`.

## Exemplo
```java
Desenvolvedor desenvolvedor = new Desenvolvedor(Desenvolvedor.DESENVOLVEDOR_BACKEND, 2500);
desenvolvedor.setAPIsDesenvolvidas(4);
System.out.println(desenvolvedor.calcularBonusDeSalarioComBaseEmProjetos());
```

## Tecnologias Utilizadas
- Java

---

Projeto desenvolvido por [lgustavogomdam](https://github.com/lgustavogomdam), ilustrando o uso do padrão Strategy para flexibilizar o cálculo de bônus de salários de desenvolvedores. Útil para entender a aplicabilidade do padrão Strategy em design de software.