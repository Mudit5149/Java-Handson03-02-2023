package hackerrank_Solution;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("\nEnter number of day :");
		int Day = input.nextInt();
		switch (Day) {
		case 7:
		System.out.println("Today is Sunday");
		break;
		case 1:
		System.out.println("Today is Monday");
		break;
		case 2:
		System.out.println("Today is Tuesday");
		break;
		case 3:
		System.out.println("Today is Wednesday");
		break;
		case 4:
		System.out.println("Today is Thursday");
		break;
		case 5:
		System.out.println("Today is Friday");
		break;
		case 6:
		System.out.println("Today is Saturday");
		break;

		}
		System.out.println("\n<<------------------->>\n");
		System.out.println("Java program to demonstrates thecontinue");
		for (int i = 0; i < 10; i++)
		{ // If the number is 2 skip and continue

		if (i == 2)
		continue;
		System.out.print(i + " ");
		

	}

	}
}
