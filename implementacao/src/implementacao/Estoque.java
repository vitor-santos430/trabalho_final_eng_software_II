package implementacao;

public class Estoque {
	private int codigo;
	private int quantidade;
	private float preco_custo;
	private float preco_venda;
	private int quantidade_minima;
	
	public void movimentar(int codigo, int quantidade, String acao) {
		if(acao == "abater") {
			this.quantidade -= quantidade;
		}else if(acao == "adicionar") {
			this.quantidade += quantidade;
		}
	}
	
	public void editar_preco_custo(int codigo, float valor) {
		this.preco_custo = valor;
	}
	
	public void editar_preco_venda(int codigo, float valor) {
		this.preco_venda = valor;
	}
	
	public void falta() {
		
	}
	
	public void listar() {
		
	}
}
