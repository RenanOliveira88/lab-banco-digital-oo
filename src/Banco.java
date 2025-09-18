import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(){
		this.contas = new ArrayList<>();
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	/***
	 * Método simples para a criação de uma conta corrente.
	 * PS a criação da conta poupança e outras funcionalidades não serão implementadas.
	 * 
	 * @param agencia - Agencia do banco
	 * @param numero - Numero da conta do cliente
	 * @param saldo - Saldo, pode ser zero
	 * @param nomeCliente - Nome do cliente para a criação da conta
	 */
	public void adicionarContaCorrente(Conta conta){
		this.contas.add(conta);
	}
	public void adicionarContaCorrente(int agencia, int numero, double saldo, String nomeCliente){
		Cliente cliente  = new Cliente(nomeCliente);
		Conta conta = new ContaCorrente(cliente);
		conta.depositar(saldo);
		this.contas.add(conta);
		
	}
	/**
	 * Implementação de deleção da conta corrente
	 * PS não será feito para conta poupança
	 * 
	 * @param agencia - Agencia para deleção
	 * @param numero - Numero da conta para deleção
	 */
	public void removerContaCorrente(int agencia, int numero){
		Conta conta = new ContaCorrente(agencia, numero);
		contas.remove(conta);
	}

	public void listarContasPorAgencia(){
		List<Conta> contasOrdenadas = new ArrayList<>(contas);
		contasOrdenadas.sort(new ContaComparatorAgencia());

		System.out.println("-----LISTAGEM DE CONTA POR AGENCIA-----");
		contasOrdenadas.stream().forEach(System.out::println);
	}
	public void listarContasPorCliente(){
		List<Conta> contasOrdenadas = new ArrayList<>(contas);
		contasOrdenadas.sort(new ContaComparatorCliente());

		System.out.println("-----LISTAGEM DE CONTA POR CLIENTE-----");
		contasOrdenadas.stream().forEach(System.out::println);
	}
}
