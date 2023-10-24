import java.lang.*;
import java.io.*;
import java.util.*;
class Fibonacci{
	public static void main(String []rgas){
		// Find the nth Fibonacci number using Dynamik programming
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(n + "th Fibonacci number is : " + fun(n));
	}
	public static int fun(int n){
		int arr[] = new int[n + 1];
		Arrays.fill(arr, -1);
		if(n <= 1){
			return n;
		}
		if(arr[n] != -1)
		{
			return arr[n];
		}
		arr[n] = fun(n - 1) + fun(n - 2);
		
		return arr[n];
		
	}
	
}
