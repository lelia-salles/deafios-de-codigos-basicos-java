# Exercícios Básicos de Código JAVA

- Desenvolvendo Java com IA - Digital Inovation One
- Formação Java Developer - Digital Inovation One

## Multiplicação Simples

Desenvolva um programa que recebe dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo). A entrada contém 2 valores inteiros. Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

## Soma Simples

Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA. A seguir escreva o valor desta variável. O arquivo de entrada contém 2 valores inteiros. Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.

## Operações Bancárias Básicas

Desenvolva um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

O programa exibirá um menu com as seguintes opções:

- Depositar
- Sacar
- Consultar Saldo
- Encerrar

O usuário escolherá uma dessas opções digitando o número correspondente. Utilizando um switch, o programa realizará a operação escolhida pelo usuário. Se o usuário escolher:

1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
0: O programa encerrará, imprimindo "Programa encerrado."

## Verificação de Conta Bancária

Desenvolva um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos. O programa solicitará ao usuário que digite o número da conta bancária. O programa utilizará um bloco ```try-catch```  para verificar se o número da conta possui exatamente 8 dígitos.

- Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
- Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException e informará que o número da conta é inválido.
