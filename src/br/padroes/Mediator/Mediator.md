## Mediator

“Definir um objeto que encapsula a forma como um conjunto de objetos interage. O Mediator promove o acoplamento fraco ao evitar que os objetos se refiram uns aos outros explicitamente e permitir variar suas interações independentemente.”

Mediator é um padrão de design comportamental que permite definir um objeto que encapsula as relações entre um conjunto de objetos para torná-los independentes uns dos outros.

### Diagramas do Mediator:
* Estrutura Básica:

![MediatorStructure](https://refactoring.guru/images/patterns/diagrams/mediator/structure.png)

* Exemplo Sistema de Mensagem Mobile:

![MediatorMobileMessage](https://brizeno.files.wordpress.com/2011/10/mediator.png?w=682)

### Exemplo:
 - Digamos que você tenha um diálogo para editar perfis de usuário. Consiste em vários campos de formulário como `TextEdits`,` Checkboxes`, `Buttons`, etc.

    Alguns elementos do formulário têm que interagir com os outros. Por exemplo, a caixa de seleção "Eu tenho um cachorro" pode mostrar um campo de texto oculto para inserir o nome do cachorro. Outro exemplo é o botão de envio que precisa validar os valores de todos os campos antes de salvar os dados.
 
    Ao colocar essa lógica diretamente no código de elementos de formulário, você dificulta muito a reutilização dessas classes em outras formas do aplicativo. Por exemplo, você não pode usar uma caixa de seleção dentro de outro formulário, uma vez que é fortemente acoplado ao campo de texto do cachorro. Você pode usar todas as classes ou nenhuma.

### Solução:
 - O padrão Mediator impede a comunicação direta entre componentes individuais. Em vez disso, eles enviam solicitações para um objeto mediador que sabe a quem direcionar essas solicitações. Os componentes perdem dezenas de dependências e tornam-se relacionados apenas ao objeto mediador.

    Em nosso exemplo, a classe de diálogo pode representar um mediador. Provavelmente, você nem precisará adicionar novas dependências à classe, já que a caixa de diálogo já conhece seus elementos de formulário filho.

    A mudança mais significativa acontecerá dentro do código dos elementos de formulário. Por exemplo, vamos considerar o botão de envio. Anteriormente, tinha que ser responsável pela validação de elementos de formulário individuais quando clicado. Mas agora, seu único trabalho seria apenas notificar o diálogo sobre o clique. Ao receber uma notificação de envio, o diálogo faria todas as validações sozinho. Desta forma, em vez de dúzias de relações com outros elementos de formulário, o botão dependerá apenas da classe de diálogo.

### Prós:
 - Reduz o acoplamento entre componentes de um programa.
 - Permite a reutilização de componentes individuais.
 - Centraliza as comunicações entre vários componentes.

### Contras:
 - O Mediator corre o risco de se tornar um objeto divino([god object anti-pattern](https://en.wikipedia.org/wiki/God_object)).

### Aplicabilidade:
 :no_entry: - __Quando dependências caóticas entre componentes transformam uma simples mudança em um componente em uma série de mudanças em todos os componentes.__
 
 :heavy_check_mark: - O Mediator extrai as relações entre classes em uma classe separada, fazendo alterações em um componente isolado do resto do código.

 ---

 :no_entry: - __Quando você não pode reutilizar um componente em um programa diferente, porque é muito dependente dos outros componentes.__
 
 :heavy_check_mark: - Depois de aplicar o mediador, os componentes individuais ficam inconscientes dos outros componentes. Eles se comunicam indiretamente por meio de um objeto mediador. Reutilizar um componente em um aplicativo diferente requer a criação de uma nova classe de mediador.

 ---

 :no_entry: - __Quando você tem que criar toneladas de subclasses de componentes apenas para usar os mesmos componentes em contextos diferentes.__
 
 :heavy_check_mark: - O mediador encapsula as relações entre os componentes. Portanto, basta criar uma nova subclasse de mediador para definir um novo conjunto de relações entre os mesmos componentes.