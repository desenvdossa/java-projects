# EN 

## Bank Account

Project for the course: Java from DIO:
[`trilha-java-basico/desafios/sintaxe`](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe).

## Context

Create an terminal application  `BankAccount`, with 
`Terminal.java` class, to collect data typed from a user.

Data type:

| Atribute | Type | Example |
| --- | --- | --- |
| Account Number | Integer | `1021` |
| Branch | Text | `067-8` |
| Client's name | Text | `MARIO ANDRADE` |
| Balace | Float | `237.48` |

Ao final, o programa exibe uma mensagem confirmando a criação da conta com os
dados informados.

## Solução

The class `Terminal` uses `Scanner` to read data by terminal, saves
each value in a variable with the correct type and prints a message at the end
using string concatenation.

File:

```text
src/main/java/Terminal.java
```

## How to open

You will need:

- JDK 21

Compile using:

```powershell
javac -encoding UTF-8 -d target\classes src\main\java\Terminal.java
```

Execute:

```powershell
java -cp target\classes Terminal
```

Type solicited data:

```text
1021
067-8
MARIO ANDRADE
237.48
```

Output:

```text
Hello Mario Andrade, thank you for creating an accaount with us! Your branch is 067-8, account 1021 and your balance is 237.48 avaliable for withdraw
```

# PT

## BankAccount

Projeto desenvolvido para o desafio de Sintaxe Java da DIO:
[`trilha-java-basico/desafios/sintaxe`](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe).

## Contexto do desafio

O objetivo é criar uma aplicação de terminal chamada `ContaBanco`, com a classe
`Terminal.java`, para coletar dados de uma conta bancária informados pelo
usuário.

Dados solicitados:

| Atributo | Tipo | Exemplo |
| --- | --- | --- |
| Número | Inteiro | `1021` |
| Agência | Texto | `067-8` |
| Nome Cliente | Texto | `MARIO ANDRADE` |
| Saldo | Decimal | `237.48` |

Ao final, o programa exibe uma mensagem confirmando a criação da conta com os
dados informados.

## Solução

A classe `Terminal` usa `Scanner` para ler os dados via terminal, armazena
cada valor em uma variável com o tipo adequado e imprime a mensagem final usando
concatenação de strings.

Arquivo principal:

```text
src/main/java/ContaTerminal.java
```

## Como executar

Requisitos:

- JDK 21 instalado

Compile o projeto:

```powershell
javac -encoding UTF-8 -d target\classes src\main\java\Terminal.java
```

Execute:

```powershell
java -cp target\classes Terminal
```

Informe os dados quando solicitado:

```text
1021
067-8
MARIO ANDRADE
237.48
```

Saída esperada:

```text
Hello Mario Andrade, thank you for creating an accaount wiith us! Your branch is 067-8, account 1021 and your balance is 237.48 avaliable for withdraw
```
