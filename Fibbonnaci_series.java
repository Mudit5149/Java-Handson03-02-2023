//Java program to print the Fibbonnaci Series numbers upto 50:

package hackerrank_Solution;

public class Fibbonnaci_series {
	public static void main(String[] args) {
		// Function to print N Fibonacci Number
		int N=10,b=-1,c=1,sum,i=1;
		do
		{
		sum=b+c;
		System.out.print(" "+sum);
		
		
		// Swap
		b=c;
		c=sum;
		i++;
		}
		
		
		
		// Iterate till i is N
		while(i<=N);
		System.out.println();
		}
	}            



