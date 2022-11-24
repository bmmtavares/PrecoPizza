/**
 * 
 * @author bmacedo
 *
 */

public class Principal {

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Calabresa");

		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Oregano");

		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Mussarela");
		pizza3.adicionaIngrediente("Calabresa");
		pizza3.adicionaIngrediente("Cebola");
		pizza3.adicionaIngrediente("Oregano");
		pizza3.adicionaIngrediente("Manjericao");
		pizza3.adicionaIngrediente("Molho Especial");

		CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();
		carrinhoCompras.Adicionar(pizza1);
		carrinhoCompras.Adicionar(pizza2);
		carrinhoCompras.Adicionar(pizza3);

		System.out.println("#######Carinho de Compras#######");

		System.out.println("Valor Total R$" + carrinhoCompras.valorTotalPizzas());

		for (String ingrediente : Pizza.qtdHashMap.keySet()) {
			System.out.println("Ingrediente: " + ingrediente + " Total:" + Pizza.qtdHashMap.get(ingrediente));
		}

		System.out.println("####### Fim #######");
	}

}
