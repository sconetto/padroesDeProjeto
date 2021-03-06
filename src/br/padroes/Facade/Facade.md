## Facade
“Fornecer uma interface unificada para um conjunto de interfaces em um subsistema. Facade define uma interface de nível mais alto que torna o subsistema mais fácil de ser usado.”

Facade é um padrão de design estrutural que permite fornecer uma interface simplificada para um sistema complexo de classes, biblioteca ou estrutura.

### Diagramas do Facade:
* Estrutura Básica:

![FacadeStructure](https://refactoring.guru/images/patterns/diagrams/facade/structure.png)

* Exemplo Customer Service (Alto Nível):

![FacadeCustomerService](https://sourcemaking.com/files/v2/content/patterns/Facade_example1.png)

### Exemplo:
 - Imagine um código que precisa trabalhar com um grande conjunto de objetos de alguma biblioteca ou estrutura complexa. Você precisa inicializar manualmente todos esses objetos, controlar as dependências, a ordem correta e assim por diante.
    
    No final, a lógica de negócios de suas classes se tornam fortemente acopladas aos detalhes de implementação de uma biblioteca de terceiros. Esse código é muito difícil de compreender e manter.

### Solução:
 - O Facade (Fachada) é uma classe que fornece uma interface simples para um subsistema complexo contendo dezenas de classes. A fachada pode ter funcionalidade limitada em comparação com o trabalho direto com o subsistema. No entanto, inclui apenas os recursos que os clientes realmente se importam.
 
    O Facade é útil quando você usa uma biblioteca sofisticada com muitas partes móveis, mas precisa apenas de uma fração de sua funcionalidade.s

### Prós:
 - Isola clientes de componentes do subsistema.
 - Minimiza o acoplamento entre o código do cliente e o subsistema.

### Contras:
 - Facede (Fachada) corre o risco de se tornar um objeto divino([god object anti-pattern](https://en.wikipedia.org/wiki/God_object)), acoplado a todas as classes de aplicativos.

### Aplicabilidade:
 :no_entry: - __Quando você precisa ter uma interface simples, mas limitada, para um subsistema complexo.__
 
 :heavy_check_mark: - Frequentemente, os subsistemas se tornam mais complexos ao longo do tempo. Mesmo a aplicação de padrões de design geralmente leva à criação de mais classes. O subsistema pode se tornar mais flexível e mais fácil de reutilizar em diferentes contextos, mas a quantidade de código padrão requer também cresce. O Facade tenta consertá-lo fornecendo acesso a uma fração de um subsistema que atenda às necessidades dos clientes.

 ---

 :no_entry: - __Quando você deseja estruturar um subsistema em camadas.__
 
 :heavy_check_mark: - Crie fachadas para definir pontos de entrada para cada nível de um subsistema. Se vários subsistemas dependerem um do outro, você poderá limitar o acoplamento, exigindo que os subsistemas se comuniquem apenas por meio de fachadas.