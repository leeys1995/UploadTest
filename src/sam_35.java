
public class sam_35 {

	public static void main(String[] args) {

		int[][] a = new int[5][5];

		int k = 0;
		int l = 1;
		int m = 5;
		int n = 1;

		for (int i = 0; i < a.length; i++) {

			if ((i % 2) != 1) {

				for (int j = 0; j < m; j++) {

					k++;
					a[i][j] = k;

				}

			} else {

				for (int j =m-1 ; j >= 0; j--) {

					k++;
					a[i][j] = k;

				}

			}
		}
		for (int x = 0; x < a.length; x++) {

			for (int e = 0; e < a[0].length; e++) { // ĭ�� ��� 5�� ����
				if (a[x][e] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(a[x][e] + "\t");
				}
			}
			System.out.println();
		}
	}

}
