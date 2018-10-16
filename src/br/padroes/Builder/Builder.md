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

### Aplicabilidade:
 :no_entry: - __Quando você tem um construtor "telescópico".__

 __Um construtor com uma dúzia de parâmetros opcionais não é conveniente para chamar. Você precisa especificar todos os parâmetros, mesmo que não precise deles.__

 __Para aliviar a dor, pode-se sobrecarregar um construtor longo e criar várias versões mais curtas com menos parâmetros. Eles ainda chamarão o construtor principal, mas passarão alguns valores padrão em parâmetros omitidos.__

 :heavy_check_mark: - O padrão Builder permite construir objetos passo a passo. Além disso, você pode usar apenas as etapas necessárias e ignorar as etapas opcionais ao criar um objeto simples.
 
 ---

 :no_entry: - __Quando seu código tem que criar diferentes representações de um produto (por exemplo, casas de pedra e de madeira). A construção do produto tem etapas semelhantes que diferem nos detalhes. Além disso, embora os produtos possam ser semelhantes, eles não precisam ter uma classe ou interface de base comum.__

 :heavy_check_mark: - O Builder pode ser usado para construir diferentes produtos usando o mesmo processo de construção.

 Cada produto distinto será representado por uma classe de construtor separada. Código que controla a ordem de construção pode viver em uma única classe de diretor.

 ---

 :no_entry: - __Quando você precisa construir uma árvore [Composite](https://github.com/sconetto/padroesDeProjeto/blob/master/src/br/padroes/Composite/Composite.md) ou outro objeto complexo.__

 :heavy_check_mark: - O Builder constrói produtos passo a passo. Ele permite construções diferidas ou até mesmo recursivas que são obrigatórias quando você está trabalhando com estruturas de árvores. O Builder não expõe o produto inacabado durante as etapas de construção. Isso impede que o código do cliente obtenha resultados corrompidos.