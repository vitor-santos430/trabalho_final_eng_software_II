package implementacao;

public class Principal {

	public static void main(String[] args) {
		//Criando Estoque
		Estoque estoqueGeral = new Estoque();
		//Adicionar Clientes
		Cliente c1 = new Cliente("Jorge","Rua Augusta", "11978569847", 1);
		//Adicionar Produtos
		Produto p1 = new Produto();
		//Adicionar recondicionamento de produto
		Recondicionar r = new Recondicionar(p1,c1,1);
		//Utiliza��o do sistema
		
		//Utiliza��o do estoque
		Estoque estoquep1 = new Estoque();
		//Realiza��o do processo de recondicionamento em uma pe�a
		c1.produto= p1;
		c1.pedido(p1, estoquep1);
		System.out.printf("O produto do cliente: %s foi verificado (%s)\n",c1.nome,r.verificar());
		r.aplicar();
		r.aplicar();
		r.aplicar();
		System.out.printf("O produto do cliente: %s foi verificado (%s)\n",c1.nome,r.verificar());
		System.out.print(r.sucatear());
	}

}
