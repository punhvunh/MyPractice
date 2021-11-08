package by.epam.learn.fundaments.operators.ternary;

public class Ternary {
	public static void main(String[] args) {
		int bonus;
		int discount = 10;
		int purchaseItem = 5;
		final int DISCOUNT_LIMIT = 3;
//		if (purchaseItem > DISCOUNT_LIMIT){
//			bonus = discount;
//			} else {
//			bonus = 0;
//		}
		bonus = purchaseItem > DISCOUNT_LIMIT ? discount: 0;
		System.out.println(bonus);
	}
}
