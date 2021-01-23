package math02;

import java.util.Scanner;

public class chan005 {
	
	public static void main(String[] args) {
		int T;
		Scanner sc =new Scanner(System.in);
		
		T = sc.nextInt();
		int N[] = new int[T];
		int output[][] = new int[T][2];
		for(int i=0; i<T; i++) {
			N[i] = sc.nextInt();
			int num[] = new int[1000001];
			int decimal[] = new int[1000001];
			int count = 0;
			
			for(int j=0; j<=N[i]; j++) {
				num[j] = j;
			}
			
			num[1] = 0;
			
			for(int j=2; j*j<=N[i]; j++) {
				for(int k=j*j; k<=N[i]; k+=j) {
					num[k] = 0;
				}
			}
			
			for(int j=2; j<=N[i]; j++) {
				if(num[j]!=0) {
					decimal[count] = num[j];
					count++;
				}
				
			}
			int standart = 0;
			
			for(int j=0; j<count; j++) {
				if(decimal[j]>=N[i]/2) {
					standart = j;
					j = count;
				}
			}
			
			int one, two;
			one = two = N[i]/2;
			for(one=N[i]/2, two=N[i]/2; one>0; one--, two++) {
				
			}
			
			
			
		}
		
		for(int i=0; i<T; i++) {
			System.out.printf("%d %d\n", output[i][0], output[i][1]);
		}
		
		
		

	}

}
