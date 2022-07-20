
public class Main {

	public static void main(String[] args) {
		Cliente evan = new Cliente();
		evan.setNome("Evan");
		
		Conta cc = new ContaCorrente(evan);
		Conta poupanca = new ContaPoupanca(evan);
		Conta especial = new ContaEspecial(evan);

		cc.depositar(20000);
		cc.transferir(10000, poupanca);
		poupanca.transferir(5000, especial);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		especial.imprimirExtrato();
	}

}