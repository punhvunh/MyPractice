package by.epam.learn.classes.classoptional.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrderAction {

	public  Optional<Order> orderActionFind(List<Order> orders, long id) {
		List<Order> result = orders.stream().filter(o -> id == o.getOrderId()).collect(Collectors.toList());
		Optional<Order> optionalOrder = result.size() != 0 ? Optional.of(result.get(0)) : Optional.empty();
		return optionalOrder;
	}

	public static Optional<Order> findByIdOptional(List<Order> orders, long id) {
		Optional<Order> optionalOrder = orders.stream().filter(o -> id == o.getOrderId()).findAny();
		return optionalOrder;

	}
}
