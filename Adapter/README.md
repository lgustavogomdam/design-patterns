# Projeto Padrão Adapter em Java

## Descrição
Este projeto implementa o padrão Adapter em Java, demonstrando como interfaces incompatíveis podem trabalhar juntas. O foco é integrar APIs de tradução distintas (Google e Microsoft) por meio de um adaptador comum, permitindo uma interface uniforme para ambas.

## Funcionalidades
- **Interface TextConverter**: Define métodos comuns para formatar e traduzir textos.
- **Adapters**:
    - **GoogleTranslateAdapter**: Adapta a API do Google Translate.
    - **MicrosoftTranslateAdapter**: Adapta a API do Microsoft Translate.

## Como Usar
Para usar, instancie um adaptador específico e utilize os métodos para formatar e traduzir textos.

## Exemplo
```java
TextConverter textConverter = new MicrosoftTranslateAdapter();
System.out.println(textConverter.traduzirTexto("Olá Mundo!"));

textConverter = new GoogleTranslateAdapter();
System.out.println(textConverter.formatarTexto("Teste de formatação"));
```

## Tecnologias Utilizadas
- Java

---

Projeto desenvolvido para ilustrar a aplicação do padrão Adapter, facilitando a integração entre APIs distintas de tradução em um sistema unificado. Ideal para entender como adaptadores podem simplificar a interação entre diferentes interfaces em um projeto de software.