package math01;

import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		int T;
		int k, n;
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		int save[] = new int[T];
		
		for(int i=0; i<T; i++) {
			k = sc.nextInt();
			n = sc.nextInt();
			int live[][] = new int[15][15];
			for(int j=0; j<n; j++) {
				live[0][j] = j+1;
			}
			
			for(int j=0; j<k+1; j++) {
				live[j][0] = 1;
			}
			
			for(int j=1; j<k+1; j++) {
				for(int h=1; h<=n-1; h++) {
					live[j][h] = live[j-1][h] + live[j][h-1];
				}
			}
			
			save[i] = live[k][n-1];
		}
		
		for(int i=0; i<T; i++)
			System.out.printf("%d\n", save[i]);

	}

}
