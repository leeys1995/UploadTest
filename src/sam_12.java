import java.util.Scanner;

public class sam_12 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int a = scn.nextInt();

		int n = 0;

		for (int i = 2; i <= a; i++) {

			n = a -(int)(a/i)*i;
					
			if(n==0) {
				
				if(a==i) {
					System.out.println("소수");
					
				}
				else {
					System.out.println("소수아님");
				}
				break;
			}
		}

				
				
		
		
	}
}
