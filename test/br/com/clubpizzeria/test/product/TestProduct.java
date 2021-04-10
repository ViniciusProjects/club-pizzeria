package br.com.clubpizzeria.test.product;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.clubpizzeria.product.Product;

public class TestProduct {

	@Test
	public void productRegistration() {
		Product p1 = new Product("");
		p1.setDescription("pizza");
		Assert.assertEquals(p1.getDescription(), "pizza");
	}

	@Test
	public void testAddProducts() {
		Product p1 = new Product("");
		p1.setPrice(100);
		p1.setDescription("pizza");
		p1.setQuantity(10);
		Assert.assertEquals(p1.getQuantity(),10);
		
	}

}
