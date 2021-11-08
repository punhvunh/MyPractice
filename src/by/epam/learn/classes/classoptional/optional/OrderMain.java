package by.epam.learn.classes.classoptional.optional;

import java.util.LinkedList;
import java.util.List;

public class OrderMain {

	public static void main(String[] args) {
		List<Order>  list = new LinkedList<>();
		list.add(0 , new Order(6L,55D));
		list.add(1 , new Order(10, 60D));
		System.out.println(OrderAction.findByIdOptional(list,10));
	}
}
