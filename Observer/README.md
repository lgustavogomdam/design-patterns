# Projeto Padrão Observer para Localização

## Descrição
Este projeto implementa o padrão Observer em Java para monitorar e responder a mudanças na localização de objetos. O padrão é usado para criar um sistema de notificação onde 'observadores' são notificados sempre que o 'observado' altera sua localização.

## Funcionalidades
- **Localização do Objeto**: Gerencia as coordenadas dos objetos observados e observadores.
- **Notificações de Mudança**: Quando a localização de um objeto muda, todos os observadores são notificados.

## Como Usar
Para utilizar este projeto, crie uma instância do `LocalizacaoObjtSubject` e adicione observadores usando o método `attach`. Atualize a localização usando `setState`, que notificará automaticamente todos os observadores.

## Exemplo
```java
LocalizacaoObjtSubject coordOBJTS = new LocalizacaoObjtSubject();
coordOBJTS.attach(new ElementoObservador(coordOBJTS));
coordOBJTS.attach(new ElementoObservado(coordOBJTS));
coordOBJTS.setState(new LocalizacaoObjetos(1.56,2.78,4.55,5.85));
```

## Tecnologias Utilizadas
- Java

---

Projeto desenvolvido para demonstrar o uso do padrão Observer em um contexto de localização de objetos. Ideal para entender como o padrão Observer facilita a reação a mudanças no estado de um objeto em sistemas de monitoramento.