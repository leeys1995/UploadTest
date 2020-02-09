import java.util.Scanner;

public class sam_02 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int max = 0, min = 0;
		System.out.println("1.정수:");
		int a = scn.nextInt();
		System.out.println("2.정수:");
		int b = scn.nextInt();

		if (a > b) {
			max=a;
			min=b;
			System.out.println("max:"+max);
			System.out.println("min:"+min);
		}

		if (a < b) {
			max=b;
			min=a;
			System.out.println("max:"+max);
			System.out.println("min:"+min);
		}
		if (a == b) {

			System.out.println("두정수는 같다.");
			
		}
	
	}

}
