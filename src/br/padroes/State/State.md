## State

“Permite a um objeto alterar seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado de classe.”

State é um padrão de design comportamental que permite que um objeto altere seu comportamento quando seu estado interno é alterado. O objeto aparecerá para mudar sua classe.

### Diagramas do State:
* Estrutura Básica:

![StateStructure](https://refactoring.guru/images/patterns/diagrams/state/structure.png)

* Exemplo Jogo Mario:

![StateMarioBros](https://brizeno.files.wordpress.com/2011/11/state.png?w=682)

### Exemplo:
 - O padrão de estado está intimamente relacionado ao conceito de [máquina de estados finitos](https://pt.wikipedia.org/wiki/M%C3%A1quina_de_estados_finita).
   Sua idéia principal é que um programa pode estar em um dos vários estados, que se seguem. O número de estados e possíveis transições entre eles é pré-definido e finito. Dependendo do estado atual, o programa se comporta de maneira diferente em resposta aos mesmos eventos.

 - A abordagem semelhante pode ser aplicada a objetos. Por exemplo, o objeto `Documento` pode estar em um dos três estados: `Rascunho`, `Moderação` e `Publicado`. Em cada estado, o método de publicação funcionará de uma maneira diferente:
   - No primeiro caso, ele moverá o documento para moderação.
   - No segundo caso, tornará o documento público, mas apenas se o usuário atual for o administrador.
   - No terceiro caso, não fará nada.
 
 - As máquinas de estado geralmente são implementadas com vários operadores condicionais, como `if` ou `switch`, que verificam o estado atual e executam o comportamento apropriado. Mesmo que você tenha acabado de ouvir falar sobre as máquinas de estado pela primeira vez, provavelmente você as implementou pelo menos uma vez.

### Solução:
 - O padrão State sugere criar novas classes para todos os estados possíveis de um objeto de contexto e extrair os comportamentos relacionados ao estado para essas classes.
 O contexto conterá uma referência a um objeto de estado que representa seu estado atual. Em vez de executar um comportamento por conta própria, o contexto delegará a execução a um objeto de estado.

### Prós:
 - Elimina condicionais de máquinas de estado.
 - Organiza o código relacionado a estados específicos em classes separadas.
 - Simplifica o código do contexto.


### Contras:
 - Pode ser um exagero se uma máquina de estado tiver apenas alguns estados ou raramente for alterada.