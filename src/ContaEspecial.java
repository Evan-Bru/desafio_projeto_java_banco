public class ContaEspecial extends Conta {

	public ContaEspecial(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Rendimento Líquido Diário ===");
		super.imprimirInfosComuns();
	}
}