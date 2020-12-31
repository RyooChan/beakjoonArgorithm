package math02;

import java.util.Scanner;

public class chan003 {
	/*
	 * 문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

->에라토스테네스의 체를 활용하여 문제를 풀었다.
	 */

	public static void main(String[] args) {
		int M, N;
		Scanner sc =new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		int num[] = new int[1000001];
		
		for(int i=0; i<=N; i++) {
			num[i] = i;
		}
		
		num[1] = 0;
		
		for(int i=2; i*i<N; i++) {
			for(int j=i*i; j<=N; j+=i) {
				num[j] = 0;
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(num[i]!=0) {
				System.out.println(num[i]);
			}
		}
		
		

	}

}
