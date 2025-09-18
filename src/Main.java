
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco banco = new Banco();
		banco.adicionarContaCorrente(cc);
		banco.listarContasPorAgencia();
		banco.listarContasPorCliente();

		banco.adicionarContaCorrente(12, 12, 400, "Ariosvaldo");
		banco.listarContasPorAgencia();
		banco.listarContasPorCliente();
	}
}
