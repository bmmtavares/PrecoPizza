import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PizzaTest {

	@BeforeAll
	static void testZeraRegistroIngredientes() {
		Pizza.zeraRegistroIngredientes();
		//assertEquals(true, Pizza.qtdHashMap.isEmpty());
		System.out.println("before all - executou testZeraRegistroIngredientes");
	}
//	static void setUpBeforeClass() throws Exception {	
//		System.out.println("antes de tudo - chamou testZeraRegistroIngredientes");
//	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("apos tudo");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("antes teste");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("apos teste");
	}

	@Test
	void testAdicionaIngrediente() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Tomate");
		
		assertEquals(true, Pizza.qtdHashMap.containsKey("Tomate"));
		System.out.println("chamou testAdicionaIngrediente()");
	}

	@Test
	void testGetPreco() {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Calabresa");
		
		assertEquals(15, pizza1.getPreco());
		System.out.println("chamou testGetPreco()");
	}
	
	@Test
	void testLimpeza() {
		Pizza.zeraRegistroIngredientes();
		assertEquals(true, Pizza.qtdHashMap.isEmpty());
		System.out.println("testLimpeza");
	}
	
	

}
