package br.com.clubpizzeria.test.product;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.com.clubpizzeria.product.Product;

public class TestProduct {

	@Test
	public void createProduct() {
		Product product = new Product();
		product.setDescription("pizza");
		product.setId(1);
		product.setPrice(30.0);
		product.setQuantity(1);
		assertNotNull(product);
	}

	@Test
	public void productRegistration() {
		Product product = new Product();
		product.setDescription("pizza");
		assertEquals(product.getDescription(), "pizza");
	}

	@Test
	public void testAddProducts() {
		Product product = new Product();
		product.setQuantity(10);
		assertEquals(product.getQuantity(), 10);
	}

	@Test
	public void testTotalValueInStock() {
		Product product = new Product();
		product.setQuantity(10);
		product.setPrice(20);
		double calc = product.getPrice() * product.getQuantity();
		assertEquals(200, calc);
	}
}
