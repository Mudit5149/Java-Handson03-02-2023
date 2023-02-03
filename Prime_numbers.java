package hackerrank_Solution;

public class Prime_numbers {

	public static void main(String[] args) {
		int num = 50, i;
		System.out.println("\n Prime numbers upto 50 :\n");
		for (i = 2; i <= num; i++) {
			boolean a = true;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					a = false;
					break;
				}
			}
			if (a == true) {
				System.out.print(" " + i);
			}
		}
		System.out.println();

	}

}
