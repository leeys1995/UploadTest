import java.util.Scanner;

public class sam_03 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("3개의 정수를 입력해주세요:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int max = 0, me = 0, min = 0;
		if (a > b) {

			if (a > c) {
				max = a;
				if (b > c) {
					me = b;
					min = c;

				} else {
					me = c;
					min = b;
				}
			} else {

				max = c;
				me = a;
				min = b;

			}
		} else {

			if (b > c) {

				max = b;

				if (a > c) {

					me = a;
					min = c;

				} else {

					me = c;
					min = a;
				}
			} else {
				
				max=c;
				me=b;
				min=a;
			}

		}
		System.out.println("최대값"+max);
		System.out.println("중간값"+me);
		System.out.println("최소값"+min);
	}

}
