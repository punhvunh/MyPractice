package by.epam.learn.classes.classoptional.optional;

import java.util.Objects;

public class Order {
	private long orderId;
	private double amount;

	public Order( long orderId, double amount) {
		this.orderId = orderId;
		this.amount = amount;
	}

	public Order() {
	}

	public long getOrderId() {
		return orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setOrderId(final long orderId) {
		this.orderId = orderId;
	}

	public void setAmount(final double amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Order)) {
			return false;
		}
		final Order order = (Order) o;
		return getOrderId() == order.getOrderId() && Double.compare(order.getAmount(), getAmount()) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getOrderId(), getAmount());
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("orderId =").append(orderId);
		sb.append(", amount='").append(amount);
		sb.append("}\n");
		return sb.toString();
	}
}
