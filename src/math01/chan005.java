package math01;

import java.util.Scanner;

public class chan005 {
	/*
	 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int A, B, V;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		V = sc.nextInt();
		
		int goal = (V-A) / (A-B);
		
		if((V-A)%(B-A)!=0)
			goal++;;
		
		goal++;
		
		System.out.print(goal);

	}

}
