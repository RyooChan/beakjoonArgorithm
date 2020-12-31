package math02;

import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int N;
		int arrcount = 0;
		int output[] = new int[1000001];
		Scanner sc =new Scanner(System.in);
		
		do{
			N = sc.nextInt();
			int num[] = new int[1000001];
			int count=0;
			
			for(int i=0; i<=N*2; i++) {
				num[i] = i;
			}
			
			num[1] = 0;
			
			for(int i=2; i*i<N*2; i++) {
				for(int j=i*i; j<=N*2; j+=i) {
					num[j] = 0;
				}
			}
			
			for(int i=N+1; i<=N*2; i++) {
				if(num[i]!=0) {
					count++;
				}
			}
			
			output[arrcount] = count;
			arrcount++;
			
		}while(N!=0);
		
		for(int i=0; i<=arrcount; i++) {
			if(output[i]!=0)
				System.out.println(output[i]);
		}

	}

}
