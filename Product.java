package FourthdayJava;

public class Product {
	public String productName;
	public int price;
	public int stock;
	
	 public int getPriceAfterDiscount (int discountPercentage) 
	 {
		 this.price=this.price-this.price*discountPercentage / 100;
		 return this.price;
	 }
	/*@test
	public void PriceValidation()
	Assert.assert(new priceValidation ().isPriceValid())
*/
}
