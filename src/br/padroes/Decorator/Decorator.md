## Decorator

O Decorator é um padrão de design estrutural que permite anexar novos comportamentos a objetos, colocando-os dentro de objetos wrapper que contêm esses comportamentos. Com o Decorator é possível anexar responsabilidades adicionais a um objeto dinamicamente. Os decoradores fornecem uma alternativa flexível à subclasse para estender a funcionalidade.

### Diagramas do Decorator:
* Estrutura Básica:

![DecoratorStructure](https://refactoring.guru/images/patterns/diagrams/decorator/structure.png)

* Exemplo Bar com Coquetéis:

![DecoratorDrinks](https://brizeno.files.wordpress.com/2011/08/decorator-exemplo-certo1.png)

### Exemplo:
 - Você precisa adicionar e remover responsabilidades de um objeto dinamicamente, mas de uma maneira que fique compatível com o resto do código do aplicativo.

### Solução:
 - O padrão decorador depende de objetos especiais chamados decoradores (ou wrappers). Eles têm a mesma interface de um objeto que eles supõem que sejam envolvidos, portanto, o código do cliente não notará quando você entregar um wrapper ao invés do objeto original.

### Prós:
 - Muito mais flexível que herança de classe.
 - Permite adicionar e remover comportamentos em tempo de execução.
 - Permite combinar vários comportamentos adicionais usando vários wrappers.
 - Permite compor objetos complexos a partir de objetos simples, em vez de ter classes monolíticas que implementam cada variante de comportamento.

### Contras:
 - É difícil configurar um objeto multi-decorado (multi-wrapped).
 - Várias classes pequenas.