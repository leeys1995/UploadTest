import java.util.Scanner;

public class sam_03 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("3���� ������ �Է����ּ���:");
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
		System.out.println("�ִ밪"+max);
		System.out.println("�߰���"+me);
		System.out.println("�ּҰ�"+min);
	}

}
