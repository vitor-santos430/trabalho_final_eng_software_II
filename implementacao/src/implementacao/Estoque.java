package implementacao;

import java.util.ArrayList;

public class Estoque {
	private int codigo;
	private int quantidade;
	private float preco_custo;
	private float preco_venda;
	private int quantidade_minima;
	private ArrayList<String> falta = new ArrayList();
	private ArrayList<String> lista = new ArrayList();
	
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
		this.falta.add("Turbina\n");
		this.falta.add("Mola\n");
		
		for(int iterador = 0; iterador < this.falta.size(); iterador++)
			System.out.print(iterador+" - "+this.falta.get(iterador));
	}
	
	public void listar() {
		this.lista.add("Cabeçote\tR$0,50  \tR$10,00 \t10\n");
		this.lista.add("Velas\tR$0,50  \tR$10,00 \t50\n");
		this.lista.add("Pistão\tR$10,00 \tR$60,00 \t20\n");
		this.lista.add("Bateria\tR$50,00 \tR$210,00\t10\n");
		this.lista.add("Nitro\tR$250,00\tR$1000,00\t5\n");
		
		System.out.println("ID  Produto\tP. Custo\tP. Venda\tQuantidade");
		for(int iterador = 0; iterador < this.lista.size(); iterador++)
			System.out.print(iterador+" - "+this.lista.get(iterador));
	}
}
