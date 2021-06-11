package implementacao;

import java.util.ArrayList;

public class Produto {
	// private ArrayList<String> produtos = new ArrayList();
	
	private int codigo;
	private String nome;
	private String categoria;
	
	public void adicionar(int codigo, String nome, String categoria) {
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
	}
	
	public void editar(int codigo, String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}

	public void excluir(int codigo) {
		this.codigo = 0;
		this.nome = "";
		this.categoria = "";
	}

	public void listar() {
		System.out.print("\n\tCodigo\t|");
		System.out.print("\tProduto\t|");
		System.out.print("\tCategoria\n");
		System.out.print("\t"+this.codigo+"\t|");
		System.out.print("\t"+this.nome+"\t|");
		System.out.print("\t"+this.categoria);
		
	}
}
