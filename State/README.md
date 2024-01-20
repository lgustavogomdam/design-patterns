# Implementação do Padrão State em Java

## Descrição
Este projeto é uma implementação do padrão de design State em Java, demonstrando a mudança de estados em um sistema de pagamento. O código permite a alteração dinâmica do método de pagamento, calculando e exibindo o valor final com base no estado atual (Dinheiro, Cartão, PIX, TED).

## Funcionalidades
- **Pagamento Padrão (Dinheiro)**: Calcula o valor com base em juros padrão.
- **Alteração de Estado**: Permite mudar o método de pagamento (Cartão, PIX, TED).
- **Cálculo Dinâmico**: Calcula o valor final de acordo com o método e as parcelas.

## Como Usar
Para utilizar o padrão State, instancie a classe `Pagamento` e utilize o método `setStatePagamento` para definir o estado desejado (método de pagamento). Então, chame `calcularValorFinal` e `mostrarValorFinal` para ver o resultado.

## Exemplo
```java
Pagamento novoPagamento = new Pagamento(100.00,1);
novoPagamento.setStatePagamento(new Cartao());
novoPagamento.calcularValorFinal();
novoPagamento.mostrarValorFinal();
```

## Tecnologias Utilizadas
- Java

---

Este projeto ilustra a flexibilidade e a aplicabilidade do padrão State em sistemas de pagamento, oferecendo um exemplo prático e funcional para o entendimento deste padrão de design.