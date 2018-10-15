## Composite

Composite é um padrão de projeto estrutural que permite compor objetos em estruturas de árvore e permitir que os clientes trabalhem com essas estruturas como se fossem objetos individuais.  O padrão Composite só faz sentido quando seu modelo de negócios pode ser representado como uma árvore.

### Diagramas do Composite:
* Estrutura Básica:

![CompositeStructure](https://refactoring.guru/images/patterns/diagrams/composite/structure.png)

* Exemplo Montadora de Carros:

![Composite](https://brizeno.files.wordpress.com/2011/09/composite.png)

### Exemplo:
 - Imagine que você trabalha em uma empresa que armazena produtos e caixas, cada caixa pode conter um ou vários produtos, com um ou mais caixas dentro desses produtos e assim sucessivamente, dessa forta dentro de uma caixa maior você terá várias caixas menores com produtos. Agora imagine que você quer saber o valor total de produtos dentro dessas várias caixas.

### Solução:
 - O Composite sugere tratar os tipos diferentes de produtos e caixas por meio de uma interface comum que tem o método `getPrice()`, dessa forma é possível percorrer todos eles e fazer uma somatória de valor e recuperar o resultado que se necessita.

### Prós:
 - Simplifica o código do cliente que precisa interagir com uma estrutura de árvore complexa.
 - Facilita a adição de novos tipos de componentes.

### Contras:
 - Cria um design de classe muito geral.