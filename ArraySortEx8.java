package hackerrank_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortEx8 {
	public static void main(String[] args) {
		int[] arr = new int [7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seven number to perform Sorting");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
//		Applying Sorting ()Methid over to above array 
		//by passing the array as an argument
		
		Arrays.sort(arr);
		
		System.out.println("\n Sorting in the Asceding order :\n");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " +arr[i]);
		}
		System.out.println();
		}
		}
		
	


