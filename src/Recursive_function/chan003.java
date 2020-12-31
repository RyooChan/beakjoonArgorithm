package Recursive_function;

import java.util.Scanner;

public class chan003 {
	/*
	 * 문제
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.

크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.

입력
첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.

출력
첫째 줄부터 N번째 줄까지 별을 출력한다.
	 */
	
	private static char star[][];
	
	public static void starout(int weight, int height, int N) {
		int length = N/3;
		
		if(N==1) {
			star[weight][height] = '*';
			return;
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==1 && j==1)
					continue;
				starout(weight+(length*i), height+(length*j), length);
			}
		}
		

	}

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
        StringBuilder out = new StringBuilder();
		
		star = new char[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++)
				star[i][j] = ' ';
		}
		
		starout(0, 0, N);

		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++){
				out.append(star[i][j]);
            }
            out.append("\n");
		}
        
            System.out.print(out);

	}

}
