# Roadmap de Aprendizado em Java

Olá! 👋 Meu nome é Gabriel Toth e estou embarcando em uma jornada de aprendizado em Java e Banco de Dados. Este roadmap pessoal foi criado para me ajudar a visualizar minha jornada de aprendizado e também para compartilhar com outros iniciantes que possam se beneficiar dele.

## Sobre Mim

- **Nome:** Gabriel Toth
- **Interesses:** Java, Banco de Dados, Desenvolvimento de Software
- **Nível de Experiência:** Iniciante

## Objetivos de Aprendizado

- Dominar os conceitos fundamentais de Java e sua aplicação prática.
- Compreender os princípios básicos de bancos de dados e como integrá-los em aplicativos Java.
- Desenvolver habilidades de resolução de problemas e pensamento lógico através da prática de programação.

## Conteúdo do Roadmap

Este roadmap é dividido em várias etapas, cada uma focando em um aspecto específico do aprendizado em Java. A medida que avanço, pretendo atualizá-lo com meu progresso e novas descobertas.

- Anatomia das classes
- Tipos e Variáveis
- Operadores

## Anatomia das classes

1. **Declaração da Classe**: 
- A declaração começa com a palavra-chave `public`, indicando que a classe é acessível de fora do pacote.
- Em seguida, vem a palavra-chave `class`, seguida pelo nome da classe (`ProjetoRoadmap`, no caso).
- As chaves `{}` delimitam o escopo da classe, onde todas as variáveis e métodos da classe serão definidos.

2. **Corpo da Classe**:
- O corpo da classe é onde você define os membros da classe, como campos, métodos, construtores, etc.

3. **Método `main`**:
- O método `main` é o ponto de entrada para o programa Java. Ele deve ser declarado como `public static void main(String[] args)`.
- Este método é onde a execução do programa Java começa.
- `String[] args` é um parâmetro que permite passar argumentos para o programa a partir da linha de comando.

Aqui está um exemplo de como usá-los:

```java
public class ProjetoRoadmap {

    // Este é o início da declaração de uma classe chamada ProjetoRoadmap

    // Aqui você pode adicionar campos (variáveis) e métodos relacionados a este projeto

    // Método main é o ponto de entrada para o programa Java
    
    public static void main(String[] args) {
        
        // Este é o corpo do método main
        
        // Aqui você pode escrever o código que será executado quando o programa iniciar
    }
}
```
## Tipos e Variáveis

Em Java, existem diferentes tipos primitivos para lidar com números inteiros e números fracionários. Vou listar ambos os tipos primitivos e, em seguida, abordar os tipos primitivos fracionários especificamente:

#### Tipos Primitivos para Números Inteiros:

1. **byte**: Armazena números inteiros de 8 bits, variando de -128 a 127.
2. **short**: Armazena números inteiros de 16 bits, variando de -32,768 a 32,767.
3. **int**: Armazena números inteiros de 32 bits, variando de -2^31 a 2^31 - 1.
4. **long**: Armazena números inteiros de 64 bits, variando de -2^63 a 2^63 - 1.

Declaramos e inicializamos variáveis dos tipos `byte`, `short`, `int` e `long`, representando diferentes tipos de dados inteiros. Aqui está um exemplo de como usá-los:

```java
public class ProjetoRoadmap {
    public static void main(String[] args) {
        // Declaração e inicialização das variáveis
        byte idade = 25;        // Armazena idade de uma pessoa
        short distancia = 1000; // Armazena distância em metros
        int populacao = 100000; // Armazena a população de uma cidade
        long saldoBancario = 1000000000L; // Armazena saldo bancário em centavos

        // Impressão dos valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Distância: " + distancia + " metros");
        System.out.println("População: " + populacao);
        System.out.println("Saldo Bancário: R$" + (saldoBancario / 100.0)); // Convertendo centavos para reais
    }
}
```

#### Tipos Primitivos para Números Fracionários:

1. **float**: Armazena números de ponto flutuante de precisão simples em 32 bits.
2. **double**: Armazena números de ponto flutuante de precisão dupla em 64 bits.

Os tipos primitivos fracionários (`float` e `double`) são usados para representar números com partes fracionárias. Aqui está um exemplo de como usá-los:

```java
public class ProjetoRoadmap {
    public static void main(String[] args) {
        float numeroFloat = 3.14f;
        double numeroDouble = 3.141592653589793;

        System.out.println("Valor float: " + numeroFloat);
        System.out.println("Valor double: " + numeroDouble);
    }
}
```

Saída:
```
Valor float: 3.14
Valor double: 3.141592653589793
```

Note que é necessário adicionar o sufixo `f` ao declarar um valor `float`, caso contrário, o compilador considerará o número como um `double`.

É importante considerar a precisão necessária ao escolher entre `float` e `double`. Geralmente, `double` é usado quando uma precisão maior é necessária, como em cálculos científicos, enquanto `float` pode ser suficiente para outros casos.

#### Variáveis

- Uma variável é um espaço de armazenamento com um nome específico onde você pode armazenar valores em um programa Java. Esses valores podem mudar durante a execução do programa. Aqui está um exemplo de como usá-los:

```java
public class VariaveisExemplo {
    public static void main(String[] args) {
        // Declaração e atribuição de uma variável
        int idade = 25; // Declara uma variável chamada "idade" e atribui o valor 25 a ela

        // Impressão do valor da variável
        System.out.println("Idade: " + idade); // Imprime o valor da variável "idade"
    }
}
```

#### Constantes

- Uma constante é um valor que não pode ser alterado durante a execução do programa. Em Java, você pode criar constantes usando a palavra-chave `final`. Aqui está um exemplo de como usá-los:

```java
public class ConstantesExemplo {
    public static void main(String[] args) {
        // Declaração de uma constante
        final double PI = 3.14159; // Declara uma constante chamada "PI" e atribui o valor 3.14159 a ela

        // Impressão do valor da constante
        System.out.println("O valor de PI é: " + PI); // Imprime o valor da constante "PI"
    }
}
```

Neste exemplo, `PI` é uma constante que armazena o valor de π (pi) e não pode ser alterada durante a execução do programa.

## Operadores

- Símbolos especiais são caracteres que têm um significado específico na linguagem de programação e estão associados a operações específicas. Eles permitem realizar diferentes tipos de manipulações e cálculos nos programas. Aqui está um exemplo de como usá-los:

| Operador | Significado                | Exemplo de Uso   | Exemplo de Comparação  |
|----------|----------------------------|------------------|-------------------------|
| +        | Adição                     | `int soma = 5 + 3;`   | 5 + 3 = 8               |
| -        | Subtração                  | `int subtracao = 7 - 2;` | 7 - 2 = 5            |
| *        | Multiplicação              | `int multiplicacao = 4 * 6;` | 4 * 6 = 24       |
| /        | Divisão                    | `int divisao = 10 / 2;`   | 10 / 2 = 5             |
| %        | Módulo (Resto da Divisão) | `int resto = 10 % 3;`   | 10 % 3 = 1             |
| +=       | Adição e Atribuição        | `x += 3;`          | x = x + 3               |
| -=       | Subtração e Atribuição     | `x -= 2;`          | x = x - 2               |
| *=       | Multiplicação e Atribuição | `x *= 4;`          | x = x * 4               |
| /=       | Divisão e Atribuição       | `x /= 2;`          | x = x / 2               |
| %=       | Módulo e Atribuição        | `x %= 3;`          | x = x % 3               |
| =       | Igualdade       | `String nome = "Toth"`          | Define o valor inicial de uma variável               |
| ==       | Igual a                    | `boolean igual = (a == b);` | Verifica se a é igual a b |
| !=       | Diferente de               | `boolean diferente = (a != b);` | Verifica se a é diferente de b |
| >        | Maior que                  | `boolean maior = (a > b);` | Verifica se a é maior que b |
| <        | Menor que                  | `boolean menor = (a < b);` | Verifica se a é menor que b |
| >=       | Maior ou igual a           | `boolean maiorOuIgual = (a >= b);` | Verifica se a é maior ou igual a b |
| <=       | Menor ou igual a           | `boolean menorOuIgual = (a <= b);` | Verifica se a é menor ou igual a b |
| &&       | E lógico                   | `boolean resultadoE = (x && y);` | Retorna verdadeiro se x E y forem verdadeiros |
| \|\|     | OU lógico                  | `boolean resultadoOU = (x \|\| y);` | Retorna verdadeiro se x OU y forem verdadeiros |
| !        | NÃO lógico                 | `boolean resultadoNao = !x;`  | Retorna o oposto do valor de x |

## Referência

 - [Java Básico](https://glysns.gitbook.io/java-basico/sintaxe/anatomia-das-classes)
