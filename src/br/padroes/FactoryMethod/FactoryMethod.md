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

### Aplicabilidade:
 :no_entry: - __Quando você não sabe exatamente os tipos e dependências dos objetos com que seu código vai funcionar.__

 __Por exemplo, ler e gravar dados de várias fontes - sistema de arquivos, banco de dados ou rede. Todas essas fontes teriam diferentes tipos, dependências e código de inicialização.__
 
 :heavy_check_mark: - O Factory Method pode ocultar os detalhes de implementação de um produto do outro código.

 Para suportar um novo tipo de produto, você só precisará criar uma nova subclasse e substituir o método de fábrica.
 
 ---

 :no_entry: - __Quando você deseja fornecer aos usuários da sua biblioteca ou 'framework' uma maneira de estender seus componentes internos.__
 
 :heavy_check_mark: - Um usuário pode subclassificar facilmente algum componente em particular. Mas como o framework reconheceria essa subclasse e trabalharia com ela em vez de um componente padrão? Um usuário terá que substituir cada método que criar instâncias de componentes padrão e alterá-los para criar objetos de uma subclasse customizada. Isso é muito estranho, não é?

 A melhor solução seria não apenas dar a um usuário meios para estender classes particulares, mas também reduzir o código que produz componentes para um único método de criação. Em outras palavras, para fornecer os métodos de fábrica (factory methods).

 Vamos ver como isso funcionaria. Imagine que você escreve um aplicativo usando uma estrutura de interface do usuário de código aberto. Seu aplicativo deve ter botões redondos, mas o framework fornece apenas os quadrados.

 A primeira coisa que você faz é implementar a classe `RoundButton`. Mas agora você precisa dizer à classe principal `UIFramework` para usar a nova classe de botão em vez de uma padrão.

 Para conseguir isso, você cria uma subclasse `UIWithRoundButtons` a partir de uma classe de framework base e sobrescreve seu método `createButton`. Este método ainda retorna objetos `Button` em uma classe base, mas sua nova subclasse produz objetos `RoundButtons`. Agora, no seu aplicativo, você deve inicializar o framework usando a classe `UIWithRoundButtons` em vez de` UIFramework`. E pronto!

 ---

 :no_entry: - __Quando você deseja salvar recursos do sistema e reutilizar objetos existentes, em vez de reconstruir novos.__

 &nbsp;&nbsp;__Por exemplo, ao lidar com objetos grandes ou com uso intenso de recursos, como conexões de banco de dados etc.__

 :heavy_check_mark: - Imagine quanto precisa ser feito para reutilizar objetos existentes:
  1. Primeiro, você precisará criar um pool para manter os objetos existentes.
  2. Quando alguém solicita um objeto, você procurará um objeto livre dentro desse pool.
  3. ...e devolvê-lo ao código do cliente.
  4. Somente se não houver objetos livres, você criará um novo (e o adicionará ao pool).
 
 Este código deve ser colocado em algum lugar. O lugar mais conveniente é um construtor. Desta forma, todas essas verificações serão executadas sempre que alguém tentar criar um objeto. Mas, infelizmente, os construtores **devem** retornar novos objetos por definição, para que eles não possam retornar instâncias existentes.

 Por outro lado, o código do cliente, que usa seus objetos, também não pode conter. Caso contrário, saberia muitos detalhes de implementação de sua classe. Portanto, você precisa ter um único método para encapsular essa lógica. Isso seria um factory method.