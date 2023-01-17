package test04;

public class Test {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("#" + i + "단");
			for (int j = 1; j <= i; j++) {
				System.out.println(i + "*" + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
