package math01;

import java.util.Scanner;

public class chan005 {
	/*
	 * �� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.

�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.

�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
