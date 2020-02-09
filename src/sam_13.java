import java.util.Scanner;

public class sam_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int k = 0;
		int n;
		System.out.println("정수를 입력하세요:");
		int m = scn.nextInt();

		for (int x = 2; x <= m; x++) {

			for (int y = 2; y <= x; y++) {
		
				n = x - (int) (x / y) * y;

				if (n == 0) {

					if (x == y) {
						k = k + 1;
					}

					break;
				}
			}

		}
		System.out.println("2~" + m + "까지의 소수개수" + k);
	}

}
