## Composite

Composite é um padrão de projeto estrutural que permite compor objetos em estruturas de árvore e permitir que os clientes trabalhem com essas estruturas como se fossem objetos individuais.  O padrão Composite só faz sentido quando seu modelo de negócios pode ser representado como uma árvore.

### Diagramas do Composite:
* Estrutura Básica:

![CompositeStructure](https://refactoring.guru/images/patterns/diagrams/composite/structure.png)

* Exemplo Composição de Arquivos:

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

### Aplicabilidade:
 :no_entry: - __Quando você precisa implementar uma estrutura semelhante a uma árvore que possui elementos e contêineres simples.__

 :heavy_check_mark: - O padrão Composite oferece dois elementos básicos: folhas simples e contêineres complexos que armazenam outras folhas ou contêineres, e assim por diante. O padrão força os contêineres a trabalhar com todos os elementos filhos por meio da interface comum, o que permite executar operações recursivamente em toda a estrutura da árvore.

 ---

 :no_entry: - __Quando os clientes devem tratar elementos simples e complexos de maneira uniforme.__

 :heavy_check_mark: - Graças à interface comum entre folhas e contêineres, o código do cliente não precisa se preocupar com o tipo de objeto com o qual trabalha.