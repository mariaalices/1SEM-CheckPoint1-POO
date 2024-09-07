import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double faturamento = 0;
		
		while(true) {
			
			//CLIENTE
			String nome;
			int cpf;
			
			System.out.println("Informe o nome do cliente(ou digite zero para encerrar o programa): ");
			nome = entrada.nextLine();
			
			if(nome.equalsIgnoreCase("0")) {
				break;
			}
			
			System.out.println("Informe o CPF do cliente: ");
			cpf = entrada.nextInt();
			entrada.nextLine(); 
			
			Cliente cliente = new Cliente(nome, cpf);
			
			//PRODUTOS
			
			int codigo; 
			String descricao;
			double valorUnitario;
			
			System.out.println("Informe o código do produto: ");
			codigo = entrada.nextInt();
			System.out.println("Informe o preço unitário do produto: ");
			valorUnitario = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Informe a descrição do produto: ");
			descricao = entrada.nextLine();
			
			Produto produto = new Produto(codigo, descricao, valorUnitario);
			
			//VENDA
			
			int quantidade;
			
			System.out.println("Informe a quantidade comprada: ");
			quantidade = entrada.nextInt();
			entrada.nextLine();
			
			Venda venda = new Venda(cliente, produto, quantidade);
			
			System.out.println("");
			System.out.println("VENDA REALIZADA COM SUCESSO!");
			
			double totVenda = venda.calcularQuantTotal();
			faturamento += totVenda;
			
			//TOTAL QUE IRÁ SER PAGO
			
			System.out.println("Total a ser pago a " + cliente.getNome() + ": " + venda.calcularQuantTotal());
			
			System.out.println("Faturamento total da loja: " + faturamento);
			
		}
		
		
		entrada.close();
	}

}
