import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Cesto totalItens = new Cesto();
		
		Fruta pesoMaca = new FrutaPeso(15.00f, "Maça", 0.95, 0.25);
		Fruta unidadeMaca = new FrutaUnidade(10, "Maça", 0.95);
		Fruta volumeMaca = new FrutaVolume(40.00f, "Maça", 0.95, 0.00);
		
		Fruta pesoPera = new FrutaPeso(20.00f, "Pera", 1.20, 0.00);
		Fruta unidadePera = new FrutaUnidade(15, "Pera", 1.20);
		Fruta volumePera = new FrutaVolume(50.00f, "Pera", 1.20, 0.00);
		
		Fruta pesoBanana = new FrutaPeso(11.50f, "Banana", 0.70, 0.00);
		Fruta unidadeBanana = new FrutaUnidade(8, "Banana", 0.70);
		Fruta volumeBanana = new FrutaVolume(45.00f, "Banana", 0.70, 0.50);
		
		System.out.println("Maça");
		
		System.out.println("\n");
		
		System.out.println("Preço peso: " + pesoMaca.pagar() + "€");
		System.out.println("Preço unidade: " + unidadeMaca.pagar() + "€");
		System.out.println("Preço volume: " + volumeMaca.pagar() + "€");
		
		totalItens.insereFruta(pesoMaca);
		totalItens.insereFruta(unidadeMaca);
		totalItens.insereFruta(unidadePera);
		totalItens.insereFruta(pesoBanana);
		totalItens.insereFruta(unidadeBanana);
		totalItens.insereFruta(volumeBanana);

		System.out.println("\n");
		
		System.out.println("Valor total de todos os frutos: " + totalItens.valorTotalFrutos());
		
		System.out.println("\n");
		
		System.out.println("Quantidade de frutas por unidade: " + totalItens.inserirTiposFruta("FrutaUnidade"));
		System.out.println("Quantidade de frutas por peso: " + totalItens.inserirTiposFruta("FrutaPeso"));
		System.out.println("Quantidade de frutas por volume: " + totalItens.inserirTiposFruta("FrutaVolume"));
		
		System.out.println("\n");
		
		System.out.println("Valor total de frutas por unidade: " + totalItens.valorTotalTiposFruta("FrutaUnidade"));
		System.out.println("Valor total de frutas por peso: " + totalItens.valorTotalTiposFruta("FrutaPeso"));
		System.out.println("Valor total de frutas por volume: " + totalItens.valorTotalTiposFruta("FrutaVolume"));
		
		System.out.println("\n");
		
		System.out.println("Desconto por peso: " + ((FrutaPeso)pesoMaca).Descontar());
		System.out.println("Desconto por volume:" + ((FrutaVolume)volumeBanana).Descontar());
	}

}
