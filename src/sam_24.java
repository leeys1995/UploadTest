
public class sam_24 {

	public static void main(String[] args) {
		int[] a = { 70, 60, 90, 80, 40, 44, 32, 22, 12 };

		for (int i = 0; i < a.length ; i++) {

			int n = a.length-i ;

			for (int j = 0; j < n-1; j++) {

				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}

		}
		for (int x = 0; x < a.length; x++) {

			System.out.print(a[x] + "\t");

		}

	}

}
