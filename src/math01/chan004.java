package math01;
import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		/*
		 * ������ ū �迭�� ������ ���� �м����� �����ִ�.

1/1	1/2	1/3	1/4	1/5	��
2/1	2/2	2/3	2/4	��	��
3/1	3/2	3/3	��	��	��
4/1	4/2	��	��	��	��
5/1	��	��	��	��	��
��	��	��	��	��	��
�̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.

X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		int X;
		int mother;
		int son;
		int num = 1;
		int count = 0; 
		int start;
		Scanner sc = new Scanner(System.in);
		
		X = sc.nextInt();
		
		while(num<=X) {
			count++;
			num += count;
		}
		
		num -= count;
		count++;
		start = X - num + 1;
		
		if(count%2==1) {
			son = start;
			mother = count - start;
		}
		else {
			son = count - start;
			mother = start;
		}
		
		
		System.out.printf("%d/%d", son, mother);
		

	}

}
