package math01;
import java.util.Scanner;

public class chan001 {
	static int five = 5;
	static int three = 3;

	public static void main(String[] args) {
		
		/*����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.

����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.

����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		
		int A;
		int weight, five_trial;
		int three_trial = 0;
		int trials = 0;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		weight = A;
		five_trial = weight / five;
		
		for(int i = five_trial; i>=0; i--) {
			weight = A;
			weight -= i*five;
			
			while(weight>0) {
				weight -= three;
				three_trial++;
			}
			
			if(weight==0) {
				trials = i + three_trial;
				break;
			}
			else
				three_trial = 0;
				
		}
		
		if(trials==0) {
			System.out.print("-1");
		}
		else
			System.out.printf("%d", trials);
		
		

	}

}
