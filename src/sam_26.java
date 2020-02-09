
public class sam_26 {

	public static void main(String[] args) {

		int[] a = { 70, 60, 90, 80, 40, 44, 32, 22, 12 };

		int j = 0;
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			for (j = i - 1; j >= 0; j--) {
				if (temp < a[j]) {
					a[j + 1] = a[j];
				}
			}
			a[j + 1] = temp;
		}

		for (int x = 0; x < a.length; x++) {

			System.out.print(a[x] + "\t");

		}

	}

}
