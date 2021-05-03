
# Trabalho-Fila de Vacinação
  ### Integrantes:
  
  [Mateus Silva Gontijo](https://github.com/MateussGont)
  
  [Philipi Gariglio Carvalho Faustino Altoe](https://github.com/Philipidev)
  
  [Thiago Kaique Ribeiro Fonseca](https://github.com/Thiago099)
  
  
  ## Introdução
  Dentro dos conceitos de estrutura de dados estudados em sala, o conceito de "Fila" foi selecionado para ser aplicado neste trabalho.
  Isso nos leva a pratica de implementação em uma situação que o mundo vive na atualidade devido a pandemia.
   
   #### Motivação
   Este trabalho foi desenvolvido com o intuito de aplicar o conceito da estrutura de dados "Fila" e contemplar as exigências da 
   atividade prática, na disciplina de Algoritmos e Estruturas de Dados II, ministrada pelo professor [Kleber Souza](https://github.com/ProfKleberSouza).
   
   #### Objetivos
   Objetivamos, ao final da realização deste, ter desenvolvido um programa interativo aonde seja possivel observar a aplicação e execução da fila
   para melhor entendimento do assunto.
   
   
  ## Desenvolvimento
  A seguir sera aprensentado um dissecamento do código, para que cada método utilzado seja melhor compreendido.

  #### [Comorbidade.java](https://github.com/Thiago099/fila-de-vacinacao-covid/blob/main/src/program/Comorbidade.java)
  Neste arquivo são listadas todas as comorbidades implementadas no programa, dentro de um "enum" para que possam ser atribuidas mais a frente no programa.
  
  #### [Ocupacao.java](https://github.com/Thiago099/fila-de-vacinacao-covid/blob/main/src/program/Ocupacao.java)
  Este arquivo lista todas as profissões validas dentro do programa, novamente é utilizado um "enum" para q possam ser atribuidas no programa principal.
  
  #### [Pessoa.java](https://github.com/Thiago099/fila-de-vacinacao-covid/blob/main/src/program/Pessoa.java)
  Arquivo utilizado para atribuir os valores de prioridade a pessoa cadastrada de acordo com idade,ocupação e comorbidade. É utilizado para definir quem estara a frente   de quem na fila de vacinação. 
  
  #### [program.java](https://github.com/Thiago099/fila-de-vacinacao-covid/blob/main/src/program/program.java)
  Programa principal aonde se encontra o CRUD para manipulação dos dados, chamada de metodos anteriores e definicoes de condições inválidas.
  
  
  ### Teste 
  Foi realizado um teste de tempo em uma situação aonde ja existia um certo número de pessoas cadastradas para ver o tempo que o algoritmo demoraria para alocar a nova   ficha na fila. Não houve uma grande alteração nos valores de tempo do algoritmo, mas possivelmente em um valor maior de pessoas cadastradas poderia gerar   uma     lentidão do programa ao alocar a pessoa na fila. Outro fator que pode ser observado é a quantidade de comorbidades e ocupações que neste caso são baixas, mas        quanto mais comorbidades e ocupações o codigo tiver, mais condições de prioridade deverão ser analisadas para que se chegue a posição relativa da pessoa na fila.
  
  
  ## Conclusão
  Com base nos processos de implementação do algoritmo, podemos concluir que o trabalho foi bem sucedido nas questões de entendimento e aplicação do conceito de Fila     dentro das questões propostas no trabalho. Outro ponto interessante que pôde ser observado foi como situações condicionais dentro de um algoritmo, podem resultar no     crescimento exponencial da quantidade de memória utilizada para realizar as comparações. 
  
  Essa atividade fora feita em equipe, sendo Thiago Kaique Ribeiro Fonseca responsável por implementar os métodos do algoritmo, Philipi Gariglio Carvalho Faustino Altoe
  responsável pela implementação do CRUD para manipulação da fila e Mateus Silva Gontijo responsável pela análise geral e construção do relatório.
