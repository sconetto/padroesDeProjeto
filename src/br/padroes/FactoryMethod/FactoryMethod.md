## Factory Method

O padrão Factory Method possui a seguinte intenção:

“Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. O Factory Method permite adiar a instanciação para subclasses.” 

Ou seja, ao invés de criar objetos diretamente em uma classe concreta, nós definimos uma interface de criação de objetos e cada subclasse fica responsável por criar seus objetos. Seria como se, ao invés de ter uma fábrica de carros, nós tivéssemos uma fábrica da Fiat, que cria o carro da Fiat, uma fábrica da Ford, que cria o carro da Ford e etc.

### Diagramas do Factory Method:
* Estrutura Básica:
![factoryMethodStructure](https://refactoring.guru/images/patterns/diagrams/factory-method/structure.png)

* Exemplo Fábrica de Carros:
![factoryMethodCarFactory](https://brizeno.files.wordpress.com/2011/09/factory-method.png)

### Exemplo:
 - Imagine que você esteja criando um aplicativo de gerenciamento de logistica. Sua primeira versão só gerencia TRUCK, mas o aplicativo cresce e agora você precisa gerenciar SHIPS.

### Solução: 
 - O factory method sugere substituir a criação direta de objetos por chamada para método especial de fábrica.

   *OBS*: Todos os produtos devem ter uma interface em comum. 

### Prós: 
 - Segue o principio de aberto/fechado.
 - Evita o acoplamento rígido entre produtos e o código.
 - Simplifica o código movendo o código criacional para um lugar.
 - Simplifica a adição de novos produtos ao programa.

### Contras: 
 - Requer subclasses extras.
