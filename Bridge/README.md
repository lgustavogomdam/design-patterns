# Projeto Bridge para Motores de Carro

## Descrição
Este projeto implementa o padrão Bridge em Java, demonstrando como diferentes tipos de motores podem ser integrados a diversos modelos de carros. O padrão Bridge é utilizado para separar a abstração dos carros da implementação dos motores, permitindo que eles variem independentemente.

## Funcionalidades
- **Integração Flexível**: Liga diferentes motores (V6 e V8) a variados modelos de carros (Dodge Charger, Pontiac) de forma independente.
- **Abstração e Implementação**: Separa a funcionalidade dos carros dos detalhes de implementação dos motores.

## Como Usar
Crie instâncias de carros específicos e associe-os a um tipo de motor usando o padrão Bridge. Inicialize o carro com o número desejado de faíscas para ligar o motor.

## Exemplo
```java
Carro carro = new DodgeCharger(new MotorV8());
carro.funcionarCarro(8);
```

## Tecnologias Utilizadas
- Java

---

O projeto serve como uma excelente ilustração do padrão Bridge, mostrando como diferentes motores podem ser adaptados a diferentes carros, proporcionando uma compreensão prática da separação entre abstração e implementação em design de software.