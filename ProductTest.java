package FourthdayJava;

import org.junit.Assert;
import org.junit.Test;


public class ProductTest {

	@Test
	public void priceValidation() {
		Product p = new Product();
		p.price = 100;
		int result = p.getPriceAfterDiscount(15);
		Assert.assertEquals(85, result);
	}

}
