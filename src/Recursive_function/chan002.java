package Recursive_function;

import java.util.Scanner;

public class chan002 {
	//재귀함수로 피보나치 수열 만들기
	
	public static int fibonacci(int N) {
		if(N==0)
			return 0;
		else if(N==1)
			return 1;
		
		
		return fibonacci(N-2) + fibonacci(N-1);
	}

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		int output = fibonacci(N);
		System.out.println(output);

	}

}
