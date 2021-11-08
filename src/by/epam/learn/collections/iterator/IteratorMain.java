package by.epam.learn.collections.iterator;

import java.util.ArrayList;

import by.epam.learn.classes.classoptional.optional.Order;

public class IteratorMain {
	public static void main(String[] args) {
		ArrayList<Order> orders =  new ArrayList<Order>(){
			{
				add(new Order(50, 12.));
				add(new Order(54, 2.9));
				add(new Order(51, 3.1));
				add(new Order(10, 14.5));
				add(new Order(230, 58.9));
			}
		};
		System.out.println(orders);
		float bigAmount = 10;
		int percent = 5;
//		OrderActionIt actionIt = new OrderActionIt();
//		actionIt.discountAction(bigAmount,orders,percent);
		orders.removeIf(o -> o.getAmount() <= bigAmount);
		orders.forEach(o -> o.setAmount(o.getAmount()*(100 - percent)/100.0));
		System.out.println(orders);
	}
}
