package minihandel;

import com.ibm.lang.management.TotalPhysicalMemoryNotificationInfo;

import java.time.LocalDate;
import java.util.*;

/**
 * Models a Customer with Orders.
 */
public class Customer {
	private String name;
	private LocalDate birthday;
	private List<Order> orders = new ArrayList<Order>();
	private Discount discount;

	/**
	 * Create a new Customer.
	 * @param name     the name.
	 * @param birthday birthday of the customer.
	 */
	public Customer(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
		discount = new Discount();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return this.birthday;
	}

	public List<Order> getOrders() {
		return new ArrayList<Order>(orders);
	}

	public void setDiscount(Discount discount){
		if(this.discount !=discount){
			this.discount = discount;
		}
	}

	public void addOrder(Order order) {
		if (!orders.contains(order)) {
			orders.add(order);
		}
	}

	public void removeOrder(Order order) {
		if (orders.contains(order)) {
			orders.remove(order);
		}
	}

	public double totalBuy(){
		double totalPris = 0;
		for(Order o : orders){
			totalPris += o.getOrderPrice();
		}
		return totalPris;
	}

	public double totalBuyWithDiscount(){
		return totalBuy()-discount.getDiscount(totalBuy());
	}

}
