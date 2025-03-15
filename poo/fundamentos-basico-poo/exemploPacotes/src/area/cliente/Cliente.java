package area.cliente;

public class Cliente {

	public void escolherLanche() {
		System.out.println("escolhendo o lanche");
	}
	public void fazerPedido() {
		System.out.println("fazendo o pedido");
	}
	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("pagando a conta");
	}
	private void consultarSaldoAplicativo() {
		System.out.println("conferindo o saldo no banco");
	}
}
