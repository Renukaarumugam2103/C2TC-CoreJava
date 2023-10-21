package COM.CG.DAY2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//Printing numbers from n to 1 using do while
		var sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			do {
				System.out.println(n);
				n--;
			}
			while(n>0);
		}
		

	}
	
}
