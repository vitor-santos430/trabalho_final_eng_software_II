package implementacao;

public class Cliente {
	public int codigo;
	public String nome;
	public String endereco;
	public String telefone;
	public Produto produto;
	
	public Cliente(String nome, String endereco, String telefone, int codigo){
		this.nome = nome;
		this.endereco = nome;
		this.telefone = nome;
	}
	
	public void produto(Produto produto) {
		this.produto = produto;
	}	
	public void pedido(Produto produto, Estoque estoque) {
		this.produto = produto;
		estoque.movimentar(this.codigo,1,"abater");
	}
	public void orcamento(Produto produto, Estoque estoque) {
		this.produto = produto;
		estoque.falta();
	}
}
