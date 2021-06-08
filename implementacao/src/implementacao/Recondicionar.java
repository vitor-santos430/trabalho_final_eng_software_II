package implementacao;

public class Recondicionar {
	private int codigoPeca;
	private int quantidade;
	private Produto produto;
	private Cliente cliente;
	public Recondicionar(Produto produto, Cliente cliente, int codigoPeca) {
		this.produto = produto;
		this.cliente = cliente;
		this.codigoPeca = codigoPeca;
	}
	public String verificar() {
		if (quantidade>=3) {
			return "Deve se realizar o sucateamento";
		}else {
			return "Peça pode ser recondicionada";
		}	
	}
	public void aplicar() {
		quantidade = quantidade + 1;
	}
	public String sucatear() {
		quantidade = 0;
		codigoPeca = 0;	
		return "Peça sucateada, pode utilizar a classe para adicionar um novo produto";		
	}
}
