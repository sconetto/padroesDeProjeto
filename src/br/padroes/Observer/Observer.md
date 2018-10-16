## Observer
“Definir uma dependência um para muitos entre objetos, de maneira que quando um objeto muda de estado todos os seus dependentes são notificados e atualizados automaticamente.”

Observer (Observador) é um padrão de design comportamental que permite definir uma dependência um-para-muitos entre os objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes sejam notificados e atualizados automaticamente.

### Diagramas do Observer:
* Estrutura Básica:

![ObserverStructure](https://refactoring.guru/images/patterns/diagrams/observer/structure.png)

* Exemplo Representação/Atualização de Dados:

![ObserverDataRepresentation](https://brizeno.files.wordpress.com/2011/10/classdiagram1.png?w=682)

### Exemplo:
 - Imagine que você tenha dois objetos, um `Cliente` e uma `Loja`. A loja está prestes a receber uma grande remessa de um novo produto, o que é muito interessante para alguns clientes.
 
    Embora os clientes possam visitar a loja todos os dias para verificar a disponibilidade do produto, a maioria dessas viagens seria inútil enquanto o produto ainda está a caminho.
 
    Por outro lado, a loja pode enviar toneladas de e-mails (spam) para todos os clientes cada vez que receber uma nova remessa. Mas isso perturbaria outros clientes, que não se importam com o novo produto.
 
    Assim, temos um conflito: ou o cliente desperdiça recursos em verificações periódicas ou a própria loja desperdiça recursos notificando os clientes errados.

### Solução:
 - Vamos chamar um objeto que tenha algum estado interessante de um `Editor`. Vamos chamar outro objeto que queira rastrear as alterações nesse estado de um `Assinante`.
 O padrão Observer fornece ao editor uma lista dos inscritos, interessados ​​em rastrear seu estado. A lista pode ser modificada através de vários métodos de subscrição disponíveis para os assinantes. Assim, cada assinante é capaz de adicionar ou remover-se da lista sempre que quiser.
 Agora a parte interessante. Cada vez que há um evento interessante dentro do editor, ele passa sobre sua lista de assinantes e chama o método de notificação em cada um de seus objetos.
 Os editores podem trabalhar com qualquer assinante, pois todos seguem a interface comum. Essa interface declara um método de notificação com um conjunto de parâmetros, que pode ser usado para fornecer aos assinantes os detalhes do evento.
 Se um aplicativo tiver vários tipos de editor, a interface comum do editor também poderá ser extraída. Consistiria em vários métodos de subscrição. A interface permitiria que os assinantes observassem o estado dos editores sem acoplá-los às suas classes concretas.

### Prós:
 - O Editor não está acoplado a classes de Assinantes concretas.
 - Você pode assinar e cancelar a inscrição de objetos dinamicamente.
 - Segue o princípio de aberto/fechado.

### Contras:
 - Os Assinantes são notificados em ordem aleatória.

### Aplicabilidade:
 :no_entry: - __Quando alterações no estado de um objeto podem exigir a alteração de outros objetos, mas são desconhecidos antecipadamente ou mudam dinamicamente.__

 __Por exemplo, você está desenvolvendo uma estrutura de GUI focada em botões. Você deseja que seus clientes conectem alguns códigos personalizados aos seus botões para que sejam acionados sempre que os usuários pressionarem o botão.__
 
 :heavy_check_mark: - O padrão Observer permite que qualquer objeto que implemente a interface do assinante se inscreva para as notificações de eventos em objetos do publicador.

 ---

 :no_entry: - __Alguns objetos devem observar os outros, mas apenas por um tempo limitado ou em casos específicos.__
 
 :heavy_check_mark: - O padrão Observer permite que os editores mantenham listas dinâmicas de inscritos. Todos os assinantes podem entrar e sair da lista sempre que desejarem em tempo de execução.