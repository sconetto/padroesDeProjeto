## Adapter

“Converter a interface de uma classe em outra interface, esperada pelo cliente. O Adapter permite que interfaces incompatíveis trabalhem em conjunto – o que, de outra forma, seria impossível.”

Ou seja, dado um conjunto de classes com mesma responsabilidade, mas interfaces diferentes, utilizamos o Adapter para unificar o acesso a qualquer uma delas.

### Diagramas do Adapter:
* Estrutura Básica:

![AdapterStrucutre](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png)

* Exemplo Renderizador de Imagens:

![AdapterImageRender](https://brizeno.files.wordpress.com/2011/10/adapter.png?w=682)

### Exemplo:
 - Imagine que você tenha um aplicativo que trabalhe com dados no formato XML, mas, em algum momento, você precisará usar uma biblioteca que só funcione com o JSON.

### Solução:
 - Você pode criar um adaptador (Adapter). É um objeto especial que converte chamadas enviadas por um objeto para o formato que outro objeto pode entender. O adaptador envolve um dos objetos para ocultar a complexidade da conversão que acontece nos bastidores.

### Prós:
 - Oculta do código do cliente detalhes de implementação desnecessários de conversão de interface e dados.

### Contras:
 - Aumenta a complexidade do código ao criar multiplas classes adicionais.