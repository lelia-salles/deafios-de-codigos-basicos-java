# Exercícios Básicos de Código JAVA

- Desenvolvendo Java com IA - Digital Inovation One
- Formação Java Developer - Digital Inovation One

## Multiplicação Simples

Desenvolva um programa que recebe dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo). A entrada contém 2 valores inteiros. Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

## Soma Simples

Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA. A seguir escreva o valor desta variável. O arquivo de entrada contém 2 valores inteiros. Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.

## Pedra Papel Tesoura

Uma partida, com dois jogadores, possuem as seguintes regras para se definir um vencedor:

- Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
- Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, porque a Pedra machuca muito mais.
- Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo sempre ganha e o Papel é patético.
- Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o Papel é inútil e ninguém que enfrenta o Papel pode perder.
- Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
- Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores perdem, devido a Aniquilação Mútua.
- Agora desenvolva um programa que, dada as escolhas de dois jogadores, informe quem venceu o jogo.

A entrada consiste de N (1 ≤ N ≤ 1000) casos de teste. N deve ser lido na primeira linha da entrada. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. A primeira string representa o sinal escolhido pelo jogador 1 e a segunda string representa o sinal escolhido pelo jogador 2. Essas strings podem ser:

- “ataque”: para representar o Ataque Aéreo
- “pedra”: para representar a Pedra
- “papel”: para representar o Papel

A saída deve conter o seguinte:

- “Jogador 1 venceu”: se o Jogador Um tiver vencido a partida
- “Jogador 2 venceu”: se o Jogador Dois tiver vencido a partida
- “Ambos venceram”: se os dois jogadores tiverem vencido a partida
- “Sem ganhador”: se não houver ganhador
- “Aniquilacao mutua”: se ocorrer Aniquilação Mútua
Cada saída de um caso de teste deve estar em uma linha.

## Lendo Pulando Nomes

Faça um programa com as características abaixo:

- Leia 10 nomes, sem espaço em branco;
- Imprima o terceiro nome da lista;
- Imprima o sétimo nome da lista;
- Imprima o nono nome da lista.

A entrada consiste vários arquivos de teste, cada um com dez linhas e em cada linha tem um nome de no até 30 caracteres e sem espaço em branco. Conforme mostrado no exemplo de entrada a seguir. Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, gere três linhas conforme os procedimentos 2, 3 e 4. Use o exemplo abaixo para clarear o que está sendo pedido.

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

## Verificação de Elegibilidade de Conta

Desenvolva um programa simples em Java para verificar se um cliente é elegiível para crira uma conta bancária. A condição é que o cliente deve ter maior que 18 anos. O programa solicitará ao usuário que digite sua idade. O programa utilizará apena sum bloco ``if/else`` para verificar se a idade é igual ou maior que 18. Caso seja, deve informar que o cliente é elegivel, se não for, deve informar que o cliente não é elegivel.
