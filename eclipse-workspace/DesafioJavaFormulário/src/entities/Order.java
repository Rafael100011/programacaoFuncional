package entities;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	public Order() {
	}
	public Order(Date moment,OrderStatus status) {
		this.moment= moment;
		this.status= status;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public List<OrderItem> getLis() {
		return items;
	}
	
	
	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem it: items) {
			sum += it.getPrice();
		}
		return sum;
	}
	
	
}
	

