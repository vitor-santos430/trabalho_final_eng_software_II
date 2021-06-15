package implementacao;

import java.util.Scanner;

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
		//Utilização do sistema
		
		//Utilização do estoque
		Estoque estoquep1 = new Estoque();
		//Realização do processo de recondicionamento em uma peça
		c1.produto= p1;
		c1.pedido(p1, estoquep1);
		System.out.printf("O produto do cliente: %s foi verificado (%s)\n",c1.nome,r.verificar());
		r.aplicar();
		r.aplicar();
		r.aplicar();
		System.out.printf("O produto do cliente: %s foi verificado (%s)\n",c1.nome,r.verificar());
		System.out.print(r.sucatear());
		
		Produto produto = new Produto();
		Estoque estoque = new Estoque();
		
		int codigo = 1;
		String nome = "Pneu";
		String categoria = "pneu";
		
		System.out.printf("\n%s foi adicionado aos produtos",nome);
		produto.adicionar(codigo, nome, categoria);
		produto.listar();
		
		System.out.print("\nO produto 1 foi editado");
		produto.editar(1, "Pneu", "roda");
		produto.listar();
		
		System.out.print("\nO produto 1 foi excluido");
		produto.excluir(1);
		produto.listar();
		
		System.out.println("\nListando produtos em falta no estoque...");
		estoque.falta();
		
		System.out.println("\nListando produtos no estoque...");
		estoque.listar();
		
		for(int i = 0; i<65;i++)
			System.out.print("*");
		
		System.out.println("\nForam adicionadas 10 unidades de Velas");
		estoque.movimentar(1, 10, "adicionar");
		
		System.out.println("Foram removidas 2 unidades de Bateria");
		estoque.movimentar(3, 2, "abater");
	}

}
