package atividade01;


public class Item {
	
	private Produto produto;
	private int quantidade;
	private double valorTotalItem;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(Produto produto, int quantidade, double valorTotalItem) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorTotalItem = valorTotalItem;
	}
	
	@Override
	public String toString() {
		return String.format("%s | Qtd: %d | Subtotal: R$ %.2f", 
				produto.getNome(), quantidade, valorTotalItem);
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorTotalItem() {
		return valorTotalItem;
	}
	public void setValorTotalItem(double valorTotalItem) {
		this.valorTotalItem = valorTotalItem;
	}
	
	public void comprar(Produto produtoSelecionado, int qtd) {
		this.produto = produtoSelecionado;
		this.quantidade = qtd;
		this.valorTotalItem = produtoSelecionado.getPreco() * qtd;
	}
}
