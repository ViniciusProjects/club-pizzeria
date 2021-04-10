package br.com.clubpizzeria.test.product;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.clubpizzeria.product.Product;

public class TestProduct {

	@Test
	public void Productregistration() {
		Product p1 = new Product("pizza");
		p1.getDescription();
		Assert.assertEquals(p1.getDescription(), "pizza");

	}

}
