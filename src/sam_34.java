
public class sam_34 {

	public static void main(String[] args) {

		int a[][] = new int[5][5];

		int k = 0;
		int l = 0;
		int m = 4;
		int n = 1;

		for (int i = 0; i <= 4; i++) {

			for (int j = l; j != m + n; j += n) {

				k++;
				a[i][j] = k;

			}
			int temp=l;
			l=m;
			m=temp;
			n*=-1;

		}

		// 출력
		for (int x = 0; x < a.length; x++) {

			for (int e = 0; e < a[0].length; e++) { // 칸수 모두 5로 고정
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
