## Adapter

“Converter a interface de uma classe em outra interface, esperada pelo cliente. O Adapter permite que interfaces incompatíveis trabalhem em conjunto – o que, de outra forma, seria impossível.”

Ou seja, dado um conjunto de classes com mesma responsabilidade, mas interfaces diferentes, utilizamos o Adapter para unificar o acesso a qualquer uma delas.

### Diagramas do Adapter:
* Estrutura Básica - Objeto Adapter:

![AdapterObjectStrucutre](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png)

* Estutura Básica - Classe Adapter:

![AdapterClassStructure](https://refactoring.guru/images/patterns/diagrams/adapter/structure-class-adapter.png)

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

### Aplicabilidade:
 :no_entry: - __Quando você quiser reutilizar a classe existente, mas sua interface não é compatível com o restante do código do aplicativo.__

 :heavy_check_mark: - O padrão Adapter cria uma classe de camada intermediária que traduz chamadas de aplicativo para o formulário que a classe existente entende.

 ---

 :no_entry: - __Você precisa reutilizar várias classes existentes, mas elas não possuem algumas funcionalidades comuns. E você não pode adicioná-lo à superclasse porque é fechado ou usado em outro código.__

 :heavy_check_mark: - Você poderia colocar a funcionalidade ausente em uma nova classe adapter. Ele conectará o código do aplicativo e as classes nas quais você está interessado. Essa solução é muito semelhante ao padrão [Visitor](https://refactoring.guru/design-patterns/visitor).