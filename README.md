# Design Patterns em Java

## Descrição
Este repositório é dedicado ao estudo e desenvolvimento pessoal de padrões de design em Java. Cada padrão é implementado com exemplos práticos, visando fornecer uma compreensão clara de sua aplicação e benefícios.

## Padrões Implementados

### Singleton
Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela. É útil quando um objeto único deve coordenar ações em todo o sistema.

### Strategy
Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. O padrão Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

### Abstract Factory
Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Este padrão é útil para sistemas que precisam ser independentes de como seus produtos são criados, compostos e representados.

### Factory Method
Define uma interface para criar um objeto, mas permite que as subclasses alterem o tipo de objetos que serão criados. Este padrão é particularmente útil quando uma classe não pode antecipar a classe de objetos que deve criar.

### State
Permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá mudar sua classe. Este padrão é útil para objetos que precisam alterar seus comportamentos com base em seu estado interno.

### Observer
Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. É amplamente usado para implementar sistemas de eventos distribuídos.

### Decorator
Anexa responsabilidades adicionais a um objeto dinamicamente. Os decoradores fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionalidades.

### Adapter
Converte a interface de uma classe em outra interface que os clientes esperam. O Adapter permite que classes com interfaces incompatíveis trabalhem juntas.

### Composite
Compõe objetos em estruturas de árvore para representar hierarquias parte-todo. Permite que os clientes tratem objetos individuais e composições de objetos de maneira uniforme.

### Template Method
Define o esqueleto de um algoritmo em uma operação, adiando alguns passos para subclasses. O Template Method permite que subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do algoritmo.

### Bridge
Desacopla uma abstração da sua implementação, para que as duas possam variar independentemente. Este padrão é útil quando se quer evitar um vínculo permanente entre uma abstração e sua implementação.

## Linguagem
- Java
