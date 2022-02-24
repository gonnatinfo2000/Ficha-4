import java.util.ArrayList;
import java.util.List;

public class Cesto {
	private List<Fruta> totalItens;
	private final int max = 100;

	public Cesto() {
		this.totalItens = new ArrayList<Fruta>(max);
	}
	
	public void insereFruta(Fruta fruta) {
		totalItens.add(fruta);
	}
	
	public double valorTotalFrutos() {
		double total = 0;
		for(Fruta fruta: totalItens) {
			total += fruta.pagar();
		}
		return total;
	}
	
	public int inserirTiposFruta(String aTipoFruta) {
		int quantidadeFruta = 0;
		for(Fruta fruta: totalItens) {
			if(aTipoFruta.equals(fruta.getClass().getSimpleName())) {
				quantidadeFruta++;
			}
		}
		return quantidadeFruta;
	}
	
	public float valorTotalTiposFruta(String aTipoFruta) {
		int valorTotal = 0;
		for(Fruta fruta: totalItens) {
			if(aTipoFruta.equals(fruta.getClass().getSimpleName())) {
				valorTotal += fruta.pagar();
			}
		}
		return valorTotal;
	}
	

	public List<Fruta> getTotalItens() {
		return totalItens;
	}

	public void setTotalItens(List<Fruta> totalItens) {
		this.totalItens = totalItens;
	}

	public int getMax() {
		return max;
	}
	
	

}
