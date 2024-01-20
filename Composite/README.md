# Projeto IDE Composite

## Descrição
Este projeto é uma implementação do padrão de design Composite, aplicado ao contexto de uma IDE de Desenvolvimento. O objetivo é demonstrar como diferentes componentes de uma IDE, como editores e terminais, podem ser gerenciados de maneira hierárquica e unificada.

## Estrutura do Projeto
O projeto consiste em várias classes que representam diferentes componentes de uma IDE:

- `ComponenteIDE`: Classe abstrata que define operações comuns para todos os componentes da IDE.
- `IDE`: Representa uma IDE, que pode conter vários componentes, como editores e terminais.
- `Editor`: Representa um editor dentro da IDE.
- `Terminal`: Representa um terminal dentro da IDE.

Além disso, há uma classe `Composite`, que serve como classe principal para demonstrar o uso do padrão Composite com os componentes da IDE.

## Como Usar
1. Clone o repositório para a sua máquina local.
2. Abra o projeto em seu ambiente de desenvolvimento Java.
3. Execute a classe `Composite` para ver o padrão Composite em ação.

## Classes Principais

### ComponenteIDE
Classe abstrata base para todos os componentes da IDE. Define as operações padrão e fornece a implementação base para as operações comuns.

### IDE
Representa uma coleção de componentes da IDE. Esta classe estende `ComponenteIDE` e implementa operações para adicionar, remover e obter componentes.

### Editor e Terminal
Estas classes representam componentes específicos dentro de uma IDE. Cada uma delas estende `ComponenteIDE` e implementa a operação de exibir seu nome.

## Linguagem
- Java
