import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarrinhoComprasTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdicionar() {
		Pizza pizza = new Pizza();
		CarrinhoDeCompras compras = new CarrinhoDeCompras();
		compras.Adicionar(pizza);
		assertEquals(true, compras.listaCarrinhoCompras.isEmpty());
	}


	@Test
	void testValorTotalPizzas() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Bacon");
		pizza.adicionaIngrediente("Tomate");
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Frango");
		pizza2.adicionaIngrediente("Queijo");
		pizza2.adicionaIngrediente("Orégano");
		
		CarrinhoDeCompras compras = new CarrinhoDeCompras();
		compras.Adicionar(pizza);
		compras.Adicionar(pizza2);
		assertEquals(40, compras.valorTotalPizzas(),0);
		//System.out.println("R$"+compras.valorTotalPizzas()); 
	}

}
