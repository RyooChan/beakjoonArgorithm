package Recursive_function;

import java.util.Scanner;

public class chan001 {
	//재귀함수로 팩토리얼 만들기
	
	public static int factorial(int N){
		if(N==0)
			return 1;
		
		if(N<=1)
			return N;
		
		return N * factorial(N-1);
	}

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		int output = factorial(N);
		System.out.println(output);

	}

}
