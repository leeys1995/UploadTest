
public class sam_39 {

	public static void main(String[] args) {

		int[][] a = { { 6, 7, 8, 9, 10 }, { 16, 17, 18, 19, 20 }, { 1, 2, 3, 4, 5, }, { 21, 22, 23, 24, 25 },
				{ 11, 12, 13, 14, 15 } };

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i][4] > a[j][4]) {

					for (int k = 0; k < a.length; k++) {

						int t = a[i][k];
						a[i][k] = a[j][k];
						a[j][k] = t;

					}

				}

			}

		}

		// ���
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
