
public class FrutaVolume extends Fruta {
	// Atributos
	private float volume;
	private double percentagemDesconto;

	// Construtores
	public FrutaVolume(float volume, String nome, double preco, double percentagemDesconto) {
		super(nome,preco);
		this.volume = volume;
		this.percentagemDesconto = percentagemDesconto;
	}

	// Getters e setters
	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}
	
	public double pagar() {
			double totalPrecoVolume = volume * getPreco();
			return totalPrecoVolume;
	}
	
	public double Descontar() {
	    	double valorDesconto = getPreco() * percentagemDesconto;
	    	return valorDesconto;
}

	public void setPercentagemDesconto(double percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}

}
