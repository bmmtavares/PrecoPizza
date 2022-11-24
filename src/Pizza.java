import java.util.HashMap;

public class Pizza {

	public int qtdIngredientes = 0;
	public static HashMap<String, Integer> qtdHashMap = new HashMap<String, Integer>();

	public void adicionaIngrediente(String ingrediente) {
		contabilizaIngrediente(ingrediente);
		this.qtdIngredientes++;
	}

	public static void contabilizaIngrediente(String ingrediente) {
		// add key and values
		if (qtdHashMap.containsKey(ingrediente)) {
			qtdHashMap.put(ingrediente, (qtdHashMap.get(ingrediente)) + 1);
		} else {
			qtdHashMap.put(ingrediente, 1);
		}
	}

	public static void zeraRegistroIngredientes() {
		qtdHashMap.clear();
	}
	
	public double getPreco() {
		double preco;
		
		// calculo
		if (this.qtdIngredientes <= 2) {
			preco = 15;
		} else if (this.qtdIngredientes >= 3 && this.qtdIngredientes <= 5) {
			preco = 20;
		} else {
			preco = 23;
		}
		return preco;
	}

}
