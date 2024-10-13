package entities;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> item = new ArrayList<>();
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
		return item;
	}
	
	
	public void addItem(OrderItem item) {
		this.item.add(item);
	}
	public void removeItem(OrderItem item) {
		this.item.remove(item);
	}
	
	
}
	

