package by.epam.learn.collections.iterator;

import java.util.Iterator;
import java.util.List;

import by.epam.learn.classes.classoptional.optional.Order;

public class OrderActionIt {
	public void discountAction(float bigAmount, List<Order> orders, int percent){
		Iterator<Order> iterator = orders.iterator();
		while(iterator.hasNext()){
			Order order = iterator.next();
			if(bigAmount >=order.getAmount()){
				iterator.remove();
			} else{
				order.setAmount(order.getAmount()*(100 - percent)/100.0);
			}
		}

	}
}
