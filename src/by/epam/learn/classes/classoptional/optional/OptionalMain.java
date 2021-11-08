package by.epam.learn.classes.classoptional.optional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class OptionalMain {

	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		list.add(new Order(10, 52D));
		list.add(new Order(8, 68D));
		list.add(new Order(7, 90D));
		list.add(new Order(5, 34D));
		list.add(new Order(9, 80D));
		list.add(new Order(20, 66D));
		OptionalMain.findById(list);
		OptionalMain.findByIdOrChange(list);
		OptionalMain.findByIdAndCreateNewList(list);
		OptionalMain.filterMethod(list);
		OptionalMain.orElseMethod(list);

	}
	public static void findById(List<Order> list) {
		OrderAction orderAction = new OrderAction();
		Optional<Order> optionalOrder = orderAction.orderActionFind(list, 10);
		if (optionalOrder.isPresent()) {
			System.out.println("Find by id |" + optionalOrder.get());
		}
	}
	public static void findByIdOrChange(List<Order> list) {
		OrderAction orderAction = new OrderAction();
		Optional<Order> optionalOrder = orderAction.orderActionFind(list, 8);
		Optional<Order> order = optionalOrder.or(() -> Optional.of(new Order(21, 56)));
		System.out.println("Find by id or change |" + order.get());
	}
	public static void findByIdAndCreateNewList(List<Order> list) {
		OrderAction orderAction = new OrderAction();
		Optional<Order> optionalOrder = orderAction.orderActionFind(list, 8);
		Set<Order> orders = new HashSet<>();
		optionalOrder.ifPresent(o -> orders.add(o));
		System.out.println("Find by id and create new list |" + orders);
	}
	public static void filterMethod(List<Order> list) {
		OrderAction orderAction = new OrderAction();
		Optional<Order> optionalOrder = orderAction.orderActionFind(list, 9);
		Optional<Order> orderFilter = optionalOrder.filter(o ->o.getAmount() == 80);
		System.out.println("Filter method |" + orderFilter.get());
	}
	public static void orElseMethod(List<Order> list) {
		OrderAction orderAction = new OrderAction();
		Optional<Order> optionalOrder = orderAction.orderActionFind(list, 100);
		System.out.println("Or else method |" + optionalOrder.orElse(new Order()));
		System.out.println("Or else get method |" + optionalOrder.orElseGet(Order:: new));
//		System.out.println(optionalOrder.orElseThrow());
		System.out.println(optionalOrder.orElseThrow(IllegalArgumentException::new));
	}
}