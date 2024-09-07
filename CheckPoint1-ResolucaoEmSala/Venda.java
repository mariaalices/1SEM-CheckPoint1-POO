public class Venda {

	private Cliente cliente;
	private Produto produto;
	private int quantidade;
	
	public Venda(Cliente cliente, Produto produto, int quantidade) {
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public double calcularQuantTotal() {
		
		return produto.getValorUnitario() * quantidade;
		
	}
	
}
