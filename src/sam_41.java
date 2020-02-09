
public class sam_41 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] b = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] c = new int[25];

		int i = 0, j = 0, k = 0;
		int z = 0;

		while (i < 10 && j < 15) {

			if (a[i] <= b[j]) {
				c[k] = a[i];
				i++;

			} else {
				c[k] = b[i];
				j++;

			}
			k++;

		}
		if (i >= 10) {

			do {
				c[k] = b[j];
				k++;
				j++;
			} while (j < 15);

		} else {
			do {
				c[k] = a[i];
				k++;
				i++;

			} while (i < 10);

		}

		for (int x = 0; x < 25; x++) {

			System.out.print(c[x] + "\t");
			z++;
			if (z == 5) {

				System.out.println();
				z = 0;
			}
		}

	}

}
