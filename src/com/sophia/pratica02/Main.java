package atividade01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Fatura fatura = new Fatura(); // instanciando um objeto de fatura
		Scanner sc = new Scanner(System.in);

		// tres produtos
		Produto p1 = new Produto("Bacalhau", 123, 120.00);
		Produto p2 = new Produto("Tomate", 456, 5.00);
		Produto p3 = new Produto("Azeitona", 789, 80.0);

		int op = 0;

		// TODO menu
		do {
			System.out.println("MENU");
			System.out.println("====Escolha um opção:====");
			System.out.println("1-Comprar");
			System.out.println("2-Ver fatura");
			System.out.println("3-Excluir");
			System.out.println("4-Alterar item");
			System.out.println("5-Finalizar");
			op = sc.nextInt();
			switch (op) {

			case 1:
				System.out.println("Produtos disponíveis:");
				System.out.println("[Produto 1]:" + p1.getNome() + " | " + p1.getCodigo() + " | R$" + p1.getPreco());
				System.out.println("[Produto 2]:" + p2.getNome() + " | " + p2.getCodigo() + " | R$" + p2.getPreco());
				System.out.println("[Produto 3]:" + p3.getNome() + " | " + p3.getCodigo() + " | R$" + p3.getPreco());


				System.out.println("\nDigite o código do produto desejado (ou 0 para cancelar e voltar): ");
				int codigoEntrada = sc.nextInt();

				//sai do case 1 e volta para o menu
				if (codigoEntrada == 0) {
					System.out.println("Operação cancelada. Voltando ao menu principal...");
					break; 
				}

				System.out.println("Digite a quantidade desejada do produto: ");
				int quantidadeEntrada = sc.nextInt();

				Produto produtoEscolhido = null;
				if (codigoEntrada == p1.getCodigo())
					produtoEscolhido = p1;
				else if (codigoEntrada == p2.getCodigo())
					produtoEscolhido = p2;
				else if (codigoEntrada == p3.getCodigo())
					produtoEscolhido = p3;

				if (produtoEscolhido != null) {
					Item novoItem = new Item();
					novoItem.comprar(produtoEscolhido, quantidadeEntrada);
					fatura.adicionarItem(novoItem);
					System.out.println("Item adicionado com sucesso!");
				} else {
					System.out.println("Produto não encontrado.");
				}
				break;
				
			case 2: 
				fatura.verFatura();
				break;

			case 3:
				System.out.println("Listando itens na fatura...");
				fatura.listarItens();
				
				System.out.println("\nDigite o número do item na lista para excluir (ou 0 para cancelar): ");
				int codigoRemover = sc.nextInt();

				if (codigoRemover == 0) {
					System.out.println("Operação cancelada. Voltando ao menu principal...");
					break;
				}
				
				//para digitar o indice 1 assumindo que o usuario nao sbe que comeca em 0
				int indiceExcluir = codigoRemover - 1; 
				fatura.excluirItem(indiceExcluir);
				System.out.println("Operação de exclusão finalizada.");
				break;

			case 4:
				System.out.println("Listando itens na fatura...");
				fatura.listarItens();
				
				System.out.print("\nDigite o número do item na lista para alterar (ou 0 para cancelar): ");
			    int codigoAlterar = sc.nextInt();

			    if (codigoAlterar == 0) {
			    	System.out.println("Operação cancelada. Voltando ao menu principal...");
					break;
			    }
			    
			    System.out.print("Digite a nova quantidade: ");
			    int novaQtd = sc.nextInt();

			    int indiceAlterar = codigoAlterar - 1;
				fatura.alterarItem(indiceAlterar, novaQtd);
				System.out.println("Operação de alteração finalizada.");
				break;
			case 5: 
				fatura.finalizar();
				break;
				
			default: System.out.println("Opção inválida.");
			}	

		} while (op != 5);

	}

}
