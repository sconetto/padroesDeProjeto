## Template Method

Template Method é um padrão de design comportamental que permite definir o esqueleto de um algoritmo e permitir que subclasses redefinam certas etapas do algoritmo sem alterar sua estrutura.
A classe base declara o algoritmo 'placeholders' e as classes derivadas implementam os 'placeholders'.


### Diagramas do Template Method:
* Estrutura Básica:

![TemplateMethodStructure](https://refactoring.guru/images/patterns/diagrams/template-method/structure.png)

* Exemplo Reprodutor de Músicas:

![TemplateMethodMusicPlayer](https://brizeno.files.wordpress.com/2011/09/template-method.png?w=682)

### Exemplo:
 - Imagine que você está escrevendo um aplicativo para documentos de escritório de mineração de dados. Os usuários alimentariam documentos em vários formatos (PDF, DOC, CSV) e receberiam dados uniformes úteis.

    A primeira versão do aplicativo poderia funcionar apenas com arquivos DOC. A edição seguinte recebeu o suporte CSV. Um mês depois, você adicionou a capacidade de extrair dados de arquivos PDF.

    Em algum momento, você notou que todos os três algoritmos de análise possuem muitos códigos semelhantes. Embora fossem muito diferentes ao lidar com formatos de arquivo, a extração e a análise de dados eram quase idênticas em todos os formatos. Por isso, seria bom livrar-se da duplicação de código, deixando a estrutura do algoritmo intacta.


### Solução:
 - O padrão Template Method sugere decompor um algoritmo em uma série de etapas, transformar etapas em métodos e chamá-los um por um dentro de um único método "modelo".

    As subclasses poderão substituir etapas específicas, mas não o método de modelo real, deixando a estrutura do algoritmo inalterada.

### Prós:
 - Ajuda a eliminar a duplicação de código.

### Contras:
 - Você está limitado ao esqueleto do algoritmo existente (template).
 - Você pode violar o [Princípio de Substituição de Liskov](https://pt.wikipedia.org/wiki/Princ%C3%ADpio_da_substitui%C3%A7%C3%A3o_de_Liskov) ao suprimir uma implementação de etapas padrão por meio de uma subclasse.
 - O Template Method tende a ser mais difícil de manter por quanto mais etapas tiver.

### Aplicabilidade:
 :no_entry: - __Quando subclasses devem ser capazes de estender o algoritmo base sem alterar sua estrutura.__
 
 :heavy_check_mark: - O Template Method transforma um algoritmo monolítico em uma série de etapas individuais, que podem ser facilmente estendidas por subclasses, enquanto mantém a estrutura, definida em uma superclasse, intacta.

 ---

 :no_entry: - __Quando você tem várias classes que fazem coisas semelhantes com apenas pequenas diferenças. Quando você altera uma das classes, também precisa alterar outras.__
 
 :heavy_check_mark: - O Template Method facilita a extração de etapas semelhantes do algoritmo em uma classe base. Código que difere entre subclasses pode permanecer dentro de subclasses.