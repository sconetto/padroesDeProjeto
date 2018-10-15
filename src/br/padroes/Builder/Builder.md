## Builder

“Separar a construção de um objeto complexo de sua representação de modo que o mesmo processo de construção possa criar diferentes representações.”

Separar a construção da representação segue a mesma ideia dos padrões Factory Method e Abstract Factory. No entanto o padrão Builder permite separar os passos de construção de um objeto em pequenos métodos. 

### Diagramas do Builder:
* Estrutura Básica:
![BuilderStructure](https://refactoring.guru/images/patterns/diagrams/builder/structure.png)

* Exemplo Montadora de Carros:
![BuilderCarDealership](https://brizeno.files.wordpress.com/2011/09/builder.png)

### Exemplo:
 - Imagine que você está construindo uma solução para um pizzaria, onde você tem diversos tipos de pizzas com os mais diversos sabores. O processo de construir a pizza normalmente segue um padrão bem definido, com a massa, o molho e o recheio. O que muda são os tipos (valores/atributos) desses recheios.

### Solução:
 - Usar o builder, instância um construtor abstrato para o seu tipo pizza, uma subclasse construtora para cada maneira de montar o seu recheio e um garçom (Director) que irá montar a pizza de acordo com a subclasse construtora que lhe for passada no tempo de execução. (Exemplo acessível neste link - [Pizza Builder](https://sourcemaking.com/design_patterns/builder/java/2))

### Prós:
 - Permite criar produtos em passos.
 - Permite usar o mesmo código para construir produtos diferentes
 - Isola o código de construção complexo de um produto da lógica de negócios principal.

### Contras:
 - Aumenta a complexidade do código ao criar multiplas classes adicionais.