package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private  List<OrderItem> items = new ArrayList<OrderItem>();
	 
	
	Client clie = new Client();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client cli) {
		this.moment = moment;
		this.status = status;
		this.clie = cli;
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

	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem it: items) {
			sum += it.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+ (sdf.format(moment))+"\n");
		sb.append("Order Status: "+status+"\n");
		sb.append("Client: "+clie+"\n");
		sb.append("Order item:\n");
		for(OrderItem it: items) {
			sb.append(it+"\n");
		}
		sb.append("Total price: $"+total());
		return sb.toString();
		
	}
	
	
}
	
