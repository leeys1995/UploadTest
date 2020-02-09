
public class sam_36 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k = 0, c = 1, i = 0, j = -1, f = 5;

		do {
				for(int n=0;n<f;n++) {
					
					k++;
					j=j+c;
					a[i][j]=k;							
					
				}
				f=f-1;
				for(int n=0;n<f;n++) {
					
					k++;
					i=i+c;
					a[i][j]=k;
					
					
				}
				c=c*-1;
		} while (f >=0);
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
