package math01;

import java.math.BigInteger;
import java.util.Scanner;

public class chan008 {
	/*
	 * 문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)

출력
첫째 줄에 A+B를 출력한다.

-> 엄청 큰수 조심해라

	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		BigInteger C = BigInteger.ZERO;
		
		C = C.add(A);
		
		
		System.out.print(C);

		
	}

}
