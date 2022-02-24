
public abstract class Fruta {
	// Atributos
	private String nome;
	private double preco;

	// Construtor
	public Fruta(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	// Método (pagar)
	public abstract double pagar();

	// Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
