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

### Aplicabilidade:
 :no_entry: - __Inicialização lenta (proxy virtual - _Lazy Initiation_). Quando você tem um objeto pesado que carrega dados de um sistema de arquivos, rede ou banco de dados.__
 
 :heavy_check_mark: - Em vez de carregar dados no início do aplicativo, pode-se atrasar a inicialização do objeto para um momento em que é necessário.

 ---

 :no_entry: - __Controle de acesso (proxy de proteção). Quando um programa tem diferentes tipos de usuários e você deseja proteger um objeto contra o uso não autorizado. Por exemplo, quando os objetos são partes cruciais de um sistema operacional e os programas (incluindo os maliciosos) são seus clientes.__

 :heavy_check_mark: - O proxy pode verificar as credenciais do cliente em cada solicitação e passar a solicitação para o objeto de serviço somente se o acesso for concedido.

 ---

 :no_entry: - __Execução local de um serviço remoto (proxy remoto). Quando um objeto de serviço real está localizado em um servidor remoto.__
 
 :heavy_check_mark: - Neste caso, o proxy passa a solicitação do cliente para um objeto de serviço remoto pela rede, manipulando todos os detalhes da transferência de rede.

 ---
 
 :no_entry: - __Objetos de armazenamento em cache (referência "inteligente" - _smart reference_). Quando você precisa armazenar em cache os resultados das solicitações do cliente e gerenciar seu ciclo de vida (quando os resultados são pesados).__
 
 :heavy_check_mark: - O proxy pode contar o número de referência para um objeto de serviço ou resultados armazenados em cache. Quando todas as referências forem liberadas, o proxy poderá destruir o objeto que rastreia (por exemplo, encerrar a conexão com o banco de dados).

 O proxy também pode controlar se o cliente alterou o objeto de serviço. Permite reutilizar o objeto inalterado e salva os recursos do sistema.

 ---
 
 :no_entry: - __Solicitação de log (proxy de log - _logging proxy_). Quando você precisa manter um histórico de solicitações para um objeto de serviço.__
 
 :heavy_check_mark: - O proxy pode registrar cada solicitação antes de transmiti-la a um objeto de serviço.