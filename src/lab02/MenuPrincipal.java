package lab02;

public class MenuPrincipal {

	public static void main(String[] args) {

		int opcao;

		System.out.print("Bem vindo ao Lojão LP2!" + "\nMenu Inicial: Digite uma das opções abaixo:"
				+ "\n\n1 - Realizar compra." + "\n2 - Mudar preço base de produtos." + "\n3 - Sair" + "\n\nOpção: ");
		opcao = CompraLojaoP2.input.nextInt();

		switch (opcao) {
		case 1:
			CompraLojaoP2.realizaCompra();

			break;

		case 2:
			CompraLojaoP2.mudarPreco();
			break;

		default:
			break;
		}

	}

}