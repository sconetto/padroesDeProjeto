## Strategy

O Strategy é um padrão de design comportamental que permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. O Strategy permite que o algoritmo varie independentemente dos clientes que o usam. Capture a abstração em uma interface, enterre detalhes de implementação em classes derivadas.

### Diagramas do Strategy:
* Estrutura Básica:

![StrategyStructure](https://refactoring.guru/images/patterns/diagrams/strategy/structure.png)

* Exemplo Transporte até um Aeroporto (Alto Nível):

![StrategyTransportAirport](https://sourcemaking.com/files/v2/content/patterns/Strategy_example1.png)

### Exemplo:
 - Um dia você decidiu criar um aplicativo de navegação para os viajantes. O aplicativo foi centrado em torno de um mapa bonito, permitindo aos usuários orientar-se rapidamente em qualquer cidade. Um dos recursos mais solicitados do aplicativo era o planejador automático de rotas, então você decidiu dedicar uma atenção especial. Os usuários poderiam digitar o destino desejado, rastreando a rota mais rápida na tela.

   Embora a primeira versão do aplicativo pudesse apenas criar rotas ao longo das estradas, ela se adaptava perfeitamente aos viajantes de carro. Mas aparentemente, nem todo mundo gosta de dirigir em suas férias. Então, com a próxima atualização, você adicionou uma opção para planejar percursos pedestres. Logo em seguida, você adicionou mais uma opção, que permitia aos usuários criar rotas com base no transporte público.

    Mas isso estava apenas começando. No futuro próximo, você planejou adicionar o construtor de rotas para ciclistas. E mais tarde, outra opção para construir rotas ao longo de locais turísticos.

    Enquanto da perspectiva de negócios o aplicativo foi um sucesso, a parte técnica causou muitas dores de cabeça.

    Cada vez que você adicionava um novo algoritmo de roteamento, a classe `Map` principal aumentara duas vezes seu tamanho. Em algum momento, a fera tornou-se muito difícil de manter.

### Solução:
- O padrão Strategy sugere uma classe que faz algo importante de várias maneiras e extrai todos esses algoritmos em classes separadas, chamadas de estratégias.

    A classe original, chamada contexto, receberá um campo para armazenar uma referência a uma das estratégias. O contexto delegará o trabalho a uma estratégia vinculada, em vez de executá-la por conta própria.

    O contexto não será responsável por escolher o algoritmo apropriado para o trabalho. Em vez disso, o cliente passará uma estratégia desejada para o contexto.

### Prós:
 - Permite a troca de algoritmos em tempo de execução.
 - Isola o código e os dados dos algoritmos das outras classes.
 - Substitui a herança pela delegação.
 - Segue o princípio de aberto/fechado.

### Contras:
 - Aumenta a complexidade geral do código, criando várias classes adicionais.
 - O cliente deve estar ciente das diferenças entre as estratégias para escolher uma adequada.

### Aplicabilidade:
 :no_entry: - __Quando você tem um objeto que deve ser capaz de fazer a mesma tarefa de várias maneiras diferentes.__
 
 :heavy_check_mark: - O padrão Strategy permite que você altere o comportamento do objeto em tempo de execução, fornecendo diferentes sub-objetos que realmente executam o trabalho.

 ---
 :no_entry: - __Quando você tem muitas classes similares, elas diferem na maneira como executam algum comportamento.__
 
 :heavy_check_mark: - O padrão Strategy permite combinar todas essas classes em uma, extraindo todas as variantes do comportamento em uma hierarquia de classes separada, tornando o comportamento da classe original personalizável.

 ---
 :no_entry: - __Quando você não deseja expor detalhes de implementação do algoritmo para outras classes.__
 
 :heavy_check_mark: - O padrão Strategy isola códigos, dados internos e dependências de algoritmos de outros objetos, extraindo-os em suas próprias classes.

 ---
 :no_entry: - __Um algoritmo a ser executado é selecionado por um operador condicional monstruoso. Cada ramo da condicional representa um algoritmo diferente.__
 
 :heavy_check_mark: - A estratégia permite decompor a condicional, extraindo cada algoritmo em suas próprias classes, todas implementando uma interface comum. O contexto delega a execução para um desses objetos, em vez de implementar o comportamento sozinho.