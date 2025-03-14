package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

	public static void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
	}
	public static void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}
	public static void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}	
	public static void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
	}
	public static void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	public static void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIOANDNO O PAO, SALADA, OVO E CARNE");
	}
	public void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
	}
	public void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	public void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA");
	}
	public void fritarIngredienteLanche() {
		System.out.println("FRITANDO CARNE E OVO");
	}
	public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirIngredientes(Almoxarife almoxarife) {
		Almoxarife.entregarIngredientes();
	}
}
