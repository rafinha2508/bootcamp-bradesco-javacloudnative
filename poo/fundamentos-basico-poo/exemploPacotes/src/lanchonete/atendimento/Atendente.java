package lanchonete.atendimento;

public class Atendente {

	public static void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("Servindo mesa");
	}
	private static void pegarLancheCozinha() {
		System.out.println("Pegando o lanche na cozinha");
	}
	public void recebendoPagamento() {
		System.out.println("recebendo o pagamento");
	}
	private void pegarPedidoBalcao() {
		System.out.println("pegando o pedido no balcao");
	}
}
