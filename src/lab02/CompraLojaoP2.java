package lab02;

import java.util.Scanner;

public class CompraLojaoP2 {

	public static Scanner input = new Scanner(System.in);
	private static double precoBase = 1.99;
	private static int numProd;

	public static void realizaCompra() {

		System.out.print("Digite a quantidade de produtos diferentes que será comprada: ");
		numProd = input.nextInt();

		String[] nomeProd = new String[numProd];
		int[] quantiaProd = new int[numProd];
		double[] percentuais = new double[numProd];
		int totalProdutos = 0;
		double totalCompra = 0;

		// Preenche o array de produtos e quantidades

		System.out.println("--­­ Cadastro de Produtos ­­--");

		for (int i = 0; i < numProd; i++) {
			input.nextLine();

			System.out.print("Nome do Produto " + (i + 1) + ": ");
			nomeProd[i] = input.nextLine();

			System.out.print("Quantidade de " + nomeProd[i] + ": ");
			quantiaProd[i] = input.nextInt();

			totalProdutos += quantiaProd[i];

		}
		// Calcula total da compra e percentuais

		totalCompra = (precoBase * totalProdutos);
		for (int i = 0; i < percentuais.length; i++) {
			percentuais[i] = Math.ceil((100.0 * quantiaProd[i]) / (totalProdutos));
		}

		// Imprime fatura

		System.out.println("--­­ Cadastro Concluído ­­-- \nA sua compra foi:");

		for (int i = 0; i < numProd; i++) {

			System.out.println(quantiaProd[i] + " " + nomeProd[i] + "(" + percentuais[i] + "%)");

		}

		System.out.println("Total de produtos: " + totalProdutos + "\nTotal de gasto: R$ " + totalCompra
				+ "\n--­­ Fim da execução --");

	}

	public static void mudarPreco() {

		System.out.print("Digite o novo preco: ");
		precoBase = input.nextDouble();
		System.out.println("Seu preço base foi atualizado para: R$ " + precoBase);

	}

}