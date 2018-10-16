## Proxy
“Fornecer um substituto ou marcador da localização de outro objeto para controlar o acesso a esse objeto.”
Proxy é um padrão de design estrutural que permite fornecer um substituto ou espaço reservado para outro objeto controlar o acesso a ele.

### Diagramas do Proxy:
* Estrutura Básica:

![ProxyStructure](https://refactoring.guru/images/patterns/diagrams/proxy/structure.png)

* Exemplo Acesso ao Banco de Dados:

![ProxyBDAccess](https://brizeno.files.wordpress.com/2011/10/capturar.png)

### Exemplo:
 - Imagine que você tem um objeto poderoso que adora consumir grandes quantidades de recursos do sistema. Você precisa disso de tempos em tempos, mas nem sempre.
 Assim, o objeto provavelmente poderia ser criado não no início do programa, mas sim quando é realmente necessário. Cada cliente desse objeto precisaria ter algum tipo de código de inicialização adiada. Obviamente, isso leva a muita duplicação.

### Solução:
 - O padrão Proxy sugere a criação de uma classe substituta que tenha a mesma interface que um objeto de serviço original. Ao receber a solicitação de um cliente, o objeto proxy cria uma instância de um objeto de serviço e delega todo o trabalho real.

 - Mas qual é o benefício? Você poderia colocar algum código em um objeto proxy que seria executado logo antes (ou depois) de chamar o mesmo método em um objeto de serviço real. E graças à mesma interface que o proxy compartilha com o objeto de serviço, ele pode ser passado para qualquer código que aceite objetos de serviço.

### Prós:
 - Controla o acesso a objetos sem que os clientes percebam.
 - Funciona mesmo quando o objeto de serviço não está pronto.
 - Gerencia o ciclo de vida de um objeto de serviço, mesmo quando os clientes não se importam.


### Contras:
 - Atraso na resposta quando chamado o serviço.