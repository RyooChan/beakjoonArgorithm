package math01;
import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		
		/*
		 * ���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 13������ 3��, 58������ 5���� ������.
		 */
		int N;
		int Tonum = 0;
		int num = 1;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		if(N!=num) 
		{
			num = 2;
			Tonum++;
			
			while(N>num) 
			{
				num += 6*Tonum;
				if(N>=num)
					Tonum++;
			}
			
		}
		System.out.print(Tonum+1);
	}

}
