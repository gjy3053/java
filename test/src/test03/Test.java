package test03;

public class Test {

	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money = " + money);
		for (int i = 0; i < coinUnit.length; i++) {
			if (money >= 500) {
				coinUnit[i] = money / 500;
				money %= 500;
				System.out.print("500원 : " + coinUnit[i] + "개, ");
			} else if (money >= 100) {
				coinUnit[i] = money / 100;
				money %= 100;
				System.out.print("100원 : " + coinUnit[i] + "개, ");
			} else if (money >= 50) {
				coinUnit[i] = money / 50;
				money %= 50;
				System.out.print("50원 : " + coinUnit[i] + "개, ");
			} else if (money >= 10) {
				coinUnit[i] = money / 10;
				money %= 10;
				System.out.print("10원 : " + coinUnit[i] + "개 ");
			}
		}
	}
}
