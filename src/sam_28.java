import java.util.Scanner;

public class sam_28 {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		Scanner scn = new Scanner(System.in);

		System.out.println("ã������ ������ �Է����ּ���:");

		int k = scn.nextInt();

		int low = 0;
		int high = 9;
		int mid = 0;
		while (true) {

			if (low <= high) {
				mid = (low + high) / 2;

				if (k == a[mid]) {

					System.out.println(mid);
					break;
				}
				if (k < a[mid]) {
					high = mid - 1;

				} else
					low = mid + 1;
			} else {

				System.out.println("�ڷ����" + k);
				break;
			}

		}

	}

}
