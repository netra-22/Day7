package kfc_app;

public class Order {
	int orderId;
	long mobileNum;
	String orders;
	
	public Order(int orderId, long mobileNum, String orders) {
		this.orderId = orderId;
		this.mobileNum = mobileNum;
		this.orders = orders;
	}
		 
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public long getMobileNum() {
		return mobileNum;
	}
	
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	public String getOrders() {
		return orders;
	}
	
	public void setOrders(String orders) {
		this.orders = orders;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", mobileNum=" + mobileNum + ", orders=" + orders + "]";
	}
	
	
}
