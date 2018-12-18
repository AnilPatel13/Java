package com.FoodPlaza.Pojo;

public class Order21136 
{

	private int orderId;
	private String customerEmailId;
	private double totalBill;
	private String status;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double d) {
		this.totalBill = d;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Order21136 [orderId=" + orderId + ", customerEmailId="
				+ customerEmailId + ", totalBill=" + totalBill + ", status="
				+ status + "]";
	}

}
