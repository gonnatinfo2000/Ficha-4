
public class FrutaPeso extends Fruta implements Descontavel {
	// Atributos
	private float peso;
	private double percentagemDesconto;

	// Construtores
	public FrutaPeso(float peso, String nome, double preco, double percentagemDesconto) {
		super(nome,preco);
		this.peso = peso;
		this.percentagemDesconto = percentagemDesconto;
	}

	// Getters e setters
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public double pagar() {
			double totalPrecoPeso = peso * getPreco();
			return totalPrecoPeso;
	}

	public double Descontar() {
		    double valorDesconto = getPreco() * percentagemDesconto;
		    return valorDesconto;
	}

	public void setPercentagemDesconto(double percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}

}
