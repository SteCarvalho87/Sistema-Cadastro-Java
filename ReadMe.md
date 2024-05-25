#DESAFIO - SISTEMA DE CADASTROS!

Objetivo desse desafio é colocar na prática os aprendizados em Java.

##Escopo do projeto:

Neste desafio, pude colocar em prática os seguintes conhecimentos:
* Orientação a Objetos
* Java io
* Streams, lambda
* Exceções
* Boas práticas de código

### O PROJETO:

O programa fará a leitura num arquivo .txt com uma lista de perguntas feitas para cadastrar um candidato.
Para cada pergunta, deve ler a resposta do usuário e armazená-la num novo arquivo .txt.
O desafio consiste em criar um sistema de CADASTRO via CLI (no terminal), em que o usuário utilizará o programa para cadastrar uma pessoa interessada, alterar seus dados, deletar uma pessoa, listar todas as pessoas cadastradas, etc.
O programa fará a leitura num arquivo .txt com uma lista de perguntas feitas para cadastrar um candidato.
Para cada pergunta, deve ler a resposta do usuário e armazená-la em um novo arquivo .txt.

#### Como foi feito?

##### Passo 1

Criação de um arquivo chamado formulario.txt, nele, deverá conter as seguintes perguntas:

1 - Qual seu nome completo?
2 - Qual seu email de contato?
3 - Qual sua idade?
4 - Qual sua altura?
 
Criação de uma aplicação que irá LER este arquivo .txt e PRINTAR as perguntas no terminal. (java.io).
Não é permitido escrever as perguntas no seu código e printa-las na tela, o programa deverá LER o arquivo, guardar o conteúdo em alguma estrutura de dados, printar na tela.

##### Passo 2

Cadastro de um primeiro usuário utilizando o Paradigma de Orientação a Objetos respondendo às 4 perguntas, e, após respondê-las, você deverá imprimindo as respostas no terminal, seguindo o padrão:

"Nome Completo: Stephanie Carvalho
Email: stephaniecarvalho@gmail.com
Idade: 28
Altura: 1.77"

##### Passo 3

Após o cadastro o programa deve criar um arquivo ".txt", e salvar essas 4 respostas dadas no passo anterior. A nomenclatura do arquivo deve seguir o seguinte formato: 1-LUCASCARRILHO.TXT.(O nome da pessoa CONCATENAdo e <MAIÚSCULO), na seguinte ordem, 1,2,3,4 e assim sucessivamente.

##### Passo 4

Criação do “menu principal” com as seguintes duas opções:

1 - Cadastrar o usuário
2 - Listar todos usuários cadastrados
3 - Cadastrar nova pergunta no formulário
4 - Deletar pergunta do formulário
5 - Pesquisar usuário por nome ou idade ou email
6 - Sair

A opção 1 já foi senvolvida.
Na opção 2, o sistema deve listar SOMENTE O NOME DE TODAS as pessoas que já fora cadastradas, como no exemplo a seguir:

1 - Lucas Carrilho
2 - Joao Pe de Feijao

##### Passo 5

Criação das opções 3 e 4 com a função de adicionar nova pergunta ao formulário ou deletar pergunta cadastrada.
Regra: Não será POSSÍVEL apagar as 4 primeiras perguntas, apenas da 5 em diante.

##### Passo 6

Implementação da opção 5 outra função que BUSCA por todos os usuários cadastrados na aplicação, seja por parte do nome ou o termo inteiro, exemplo:

Cadastrados : Lucas Almeida, Luca De Sá, Luc Montavão.

Caso o usuário digite “Luca”, deverá retornar somente o primeiro e o segundo com suas devidas informações. (OO + ordenação).

##### Passo 7

Agora, vamos adicionar algumas validações a nossa aplicação.

1. Momento de cadastro de usuário:

O usuário deverá possuir no mínimo 10 caracteres de nome, deverá possuir obrigatoriamente o campo @ no e-mail, deverá ter mais de 18 anos, e o formato da altura preenchida deverá ser sempre o número com virgulas.

Para todos esses erros, deverão ser lançadas EXCEÇÕES explicando a causa do problema.

Caso existam 2 emails iguais, o sistema NÃO deverá permitir o cadastro.

2. Momento de cadastro perguntas

O usuário não vai precisar digitar o número da pergunta a ser cadastrada, isso deverá ser de forma AUTOMÁTICA.
Se temos 6 perguntas, ele vai digitar a sétima e ficará no formato:
7 - Qual seu hobbie favorito?

3. Momento de deletar perguntas

O usuário deverá apontar o número da pergunta que deseja DELETAR, somente isso e será apagado do formulário.

