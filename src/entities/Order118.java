package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus118;

public class Order118 {
	
	private Date moment;
	private OrderStatus118 status;
	
	//relacionamento
	private Client118 client;
	private List<OrderItem118> items = new ArrayList();
	
	public Order118() {
	}

	public Order118(Date moment, OrderStatus118 status, Client118 client, List<OrderItem118> items) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus118 getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus118 status) {
		this.status = status;
	}

	public Client118 getClient() {
		return client;
	}

	public void setClient(Client118 client) {
		this.client = client;
	}

	public List<OrderItem118> getItems() {
		return items;
	}
	public void addItem(OrderItem118 item) {
		items.add(item);
	}
	public void removeitem(OrderItem118 item){
		items.remove(item);
	}
	public double total() {
		double sum = 0.0;
		for (OrderItem118 item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "Order118 [moment=" + moment + ", status=" + status + ", client=" + client + ", items=" + items + "]";
	}
	
}
