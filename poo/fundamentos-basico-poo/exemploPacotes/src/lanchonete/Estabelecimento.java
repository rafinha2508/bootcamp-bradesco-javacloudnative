package lanchonete;

import area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

	public static void main() {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que nao precisam estarem disponiveis para toda a aplicação
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();
		
		//ações que o estabelecimento precisa ter ciencia
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicinarLancheBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estares disponiveis para toda a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.recebendoPagamento();
		atendente.servindoMesa();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//nao deveria, mas o estabelecimento ainda
		//não definiu normas de atendimento
		cliente.pegarPedidoBalcao();
		
		//ação sigilosa, preferencialmente ser privada
		cliente.consultarSaldoAplicativo();
		
		//o cliente que nao precisa saber que o gas acabou
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);
	}
}
