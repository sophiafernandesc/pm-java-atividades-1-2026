package atividade01;

import java.util.ArrayList;

public class Fatura {

	private ArrayList<Item> listaItens = new ArrayList<>();
	private double valorTotal;

	public Fatura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fatura(Item item, ArrayList<Item> listaItens, double valorTotal) {
		super();
		this.listaItens = new ArrayList<>();
		this.valorTotal = 0.0;
	}

	public ArrayList<Item> getListaItens() {
		return listaItens;
	}

	public void setListaItens(ArrayList<Item> listaItens) {
		this.listaItens = listaItens;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	// TODO ver fatura chama listar itens, imprime o valor total(final)
	public void verFatura() {
		listarItens();
		System.out.println("Valor final da fatura: R$" + getValorTotal());
	}

	public void listarItens() {
		if (this.listaItens.isEmpty()) {
			System.out.println("Fatura/lista vazia ");
			return;
		}
		for (int i = 0; i < this.listaItens.size(); i++) {
			Item item = this.listaItens.get(i);
			System.out.println(item); // To string?
		}
	}

	public void adicionarItem(Item novoItem) {
		this.listaItens.add(novoItem);
		this.valorTotal += novoItem.getValorTotalItem();
	}

	public void excluirItem(int codigo) {
		Item itemRemovido = this.listaItens.get(codigo);
		this.valorTotal -= itemRemovido.getValorTotalItem();
		this.listaItens.remove(codigo);
	}

	public void finalizar() {
		System.out.println("Finalizando compra...");
		System.out.println("Valor total a pagar: R$" + getValorTotal());
		System.out.println("Obrigado por comprar na tenda da bacalhoada");
	}

	public void alterarItem(int codigo, int novaQuantidade) {
		if (codigo >= 0 && codigo < this.listaItens.size()) {

			Item item = this.listaItens.get(codigo); 

			this.valorTotal -= item.getValorTotalItem();

			//nova quantidade
			item.setQuantidade(novaQuantidade);
			item.setValorTotalItem(item.getProduto().getPreco() * novaQuantidade);

			this.valorTotal += item.getValorTotalItem();

			System.out.println("Quantidade alterada.");
		} else {
			System.out.println("Item não encontrado na fatura.");
		}
	}
}
