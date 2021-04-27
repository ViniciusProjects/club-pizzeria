package br.com.clubpizzeria.test.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.com.clubpizzeria.product.Product;

public class ProductTest {

	public Product create() {
		Product product = new Product();
		product.setDescription("pizza");
		product.setId(1);
		product.setPrice(30.0);
		product.setQuantity(1);
		return product;
	}

	@Test
	public void productRegistration() {
		Product product = create();
		assertEquals(product.getDescription(), "pizza");
	}

	@Test
	public void testAddProducts() {
		Product product = create();
		assertEquals(product.getQuantity(), 1);
	}

	@Test
	public void testTotalValueInStock() {
		Product product = create();
		double calc = product.getPrice() * product.getQuantity();
		assertEquals(30, calc);
	}

	@Test
	public void testRemoveProducts() {
		Product product = create();
		product.removeProducts(1);
		assertEquals(0, product.getQuantity());
	}
}
