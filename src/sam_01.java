import java.util.Scanner;

public class sam_01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		int a = scn.nextInt();

		if (a > 100) {
			System.out.println("�Է¿���");

		} else if (a >= 90) {
			System.out.println("��");
		} else if (a >= 80) {
			System.out.println("��");
		} else if (a >= 70) {
			System.out.println("��");
		} else if (a >= 60) {
			System.out.println("��");
		} else if (a >= 0 && a < 60) {
			System.out.println("��");

		}
	}

}
