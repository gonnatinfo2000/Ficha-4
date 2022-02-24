
public class FrutaUnidade extends Fruta {
	// Atributos
	private int quantidade;

	// Construtores
	public FrutaUnidade(int quantidade, String nome, double preco) {
		super(nome,preco);
		this.quantidade = quantidade;
	}

	// Getters e setters
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double pagar() {
		double totalPrecoQuantidade = quantidade * getPreco();
		return totalPrecoQuantidade;
	}
	
}
