O código deve ser executado em uma IDE que compreenda Java, recomendamos a utilização do Eclipse, para verificação de cada uma 
das classes, basta realizar a importação do projeto no programa, para utilizar basta acessar a classe Principal, onde todas
as funcionalidades do programa estão demonstradas com exemplos básicos, para realizar a utilização de uma classe, basta verificar
quais os métodos ela possui na documentação de arquitetura e realizar os códigos de acordo com essa questão, dividiremos agora por
classes e seus métodos que podem ser utilizados no sistema.

OBS: As informações que estiverem entre aspas, devem ser adicionadas entre aspas no programa também.
A criação de classe deve ser realizada da seguinte maneira: nomeDaClasse nomeAtribuido = new nomeDaClasse(argumentos)

Cliente:
Ao adicionar um cliente será utilizado o construtor e deve ter os seguintes argumentos ("nome do cliente", "endereço", "telefone", codigo)
nomeAtribuido.produto(Identificação do produto pela classe)
nomeAtribuido.pedido(Identificação do produto pela classe, identificação do estoque daquele produto)
nomeAtribuido.orcamento(Identificação do produto pela classe, identificação do estoque daquele produto)

Estoque:
nomeAtribuido.movimentar() --> através desse metodo é possível remover ou adicionar um item ao estoque.
nomeAtribuido.editar_preco_custo() --> Esse metodo é responsável por alterar o preço de custo.
nomeAtribuido.editar_preco_venda() --> Esse metodo é responsável por alterar o preço de Venda.
nomeAtribuido.falta() --> Metodo responsável por listar produtos em falta no estoque.
nomeAtribuido.listar() --> Esse metodo lista todos os produtos do estoque.

Produto:


Recondicionar:
Ao criar um recondicionamento para uma peça específica, deve ter os seguintes argumentos(Produto,Cliente,código)
nomeAtribuido.verificar() --> Esse terá um retorno informando se é possível recondicionar a peça novamente ou não.
nomeAtribuido.aplicar() 
nomeAtribuido.sucatear() --> Esse terá um retorno que a peça foi sucateada.
