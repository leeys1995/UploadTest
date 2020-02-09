import java.util.Scanner;

public class sam_14 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int m = scn.nextInt();
		int i = 2;
		int k = 0;

		while (true) {

			int j = 2;

			while (true) {

				int n = i - (int) (i / j) * j;
				if (n == 0) {
					break;
				}
				j++;
			}
			if (i == j) {

				k++;

			}
			if (i == m)break;
			else {
				
				i++;
			}
		}
		System.out.print(m+"까지의 소수개수"+k);
	}
}	


