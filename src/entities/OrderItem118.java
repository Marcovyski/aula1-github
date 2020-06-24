package entities;

public class OrderItem118 {
	
	private Integer quantity;
	private Double price;
	
	//relacionamento
	private Product118 product;
	
	public OrderItem118(){
	}

	public OrderItem118(Integer quantity, Double price, Product118 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product118 getProduct() {
		return product;
	}

	public void setProduct(Product118 product) {
		this.product = product;
	}
	public double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return "OrderItem118 [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}
	
	

}
