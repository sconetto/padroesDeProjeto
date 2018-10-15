## Abstract Method

O padrão Abstract Method possui a seguinte intenção:

Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

### Diagramas do Abstract Method
* Estrutura Básica:
![AbstractMethodStructure](https://refactoring.guru/images/patterns/diagrams/abstract-factory/structure.pngs)

* Exemplo Fábrica de Carros:
![AbstractMethodCarFactory](https://brizeno.files.wordpress.com/2011/09/abstract-factory.png)
    
### Exemplo:
 - Você precisa de uma fábrica de sedan e um fabrica de carros populares. Dentro de cada fábrica você tem um carro fiat e um ford.

    *OBS*: Todos os produtos devem ter uma interface em comum.

### Solução
 - Utilizar o Abstract Method fazendo com que cada variante de produto siga uma interface em comum para aquela produto, no caso do exemplo deve existir para cada fábrica de produto uma interface que crie carros sendans e carros populares.

### Prós: 
 - Segue o principio de aberto/fechado.
 - Permite construit familias de objetos de produto e garante sua compatibilidade.
 - Evita o acoplamento rígido entre produtos e o código.
 - Divide a responsabilidade entre várias classes.

### Contras: 
 - Aumenta a complexidade média do código criando multiplas subclasses extras.