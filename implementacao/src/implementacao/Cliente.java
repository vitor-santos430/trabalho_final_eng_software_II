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
	public void pedido(Produto produto, Estoque e1) {
		this.produto = produto;
		//Continuar apos estoque ser criado
	}
	public void orcamento(Produto produto, Estoque e1) {
		//Continuar com estoque criado
	}
}
