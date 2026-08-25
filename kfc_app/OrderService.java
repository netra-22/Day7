package kfc_app;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrderService {
	Deque<Order> allOrders=new ArrayDeque<>();
	
	void placeOrder(Order newOrder) {
		allOrders.offer(newOrder);
		System.out.println("Order placed!");
	}
	
	void showAllOrder() {
		System.out.println("All orders:");
		for(Order ord:allOrders) {
			System.out.println(ord);
		}
	}
	
	void removeOrder() {
		System.out.println("Removed Order: "+allOrders.peek());
		allOrders.poll();
	}
	
	Order nextOrder() {
		return allOrders.peek();
	}
}
