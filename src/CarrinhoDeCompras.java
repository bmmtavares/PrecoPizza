import java.util.ArrayList;

public class CarrinhoDeCompras {

	ArrayList<Pizza> listaCarrinhoCompras = new ArrayList<Pizza>();

	public void Adicionar(Pizza pizza) {
		if (pizza.qtdIngredientes > 0) {
			listaCarrinhoCompras.add(pizza);
		} else {
			System.out.println("Pizza sem ingrediente!");
		}
	}

	public double valorTotalPizzas() {
		double valorTotal = 0;
		for (Pizza pizza : listaCarrinhoCompras) {
			valorTotal += pizza.getPreco();
		}
		return valorTotal;
	}

}
