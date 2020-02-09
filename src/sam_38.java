
public class sam_38 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		
		int k=0;
		
		for(int i=0;i<a.length;i++) {
			
			a[i][4]=0;
			a[4][i]=0;
			
		}
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=0;j<a.length-1;j++) {
				
				k++;
				a[i][j]=k;
				
				a[i][4]=a[i][4]+k;
				a[4][j]=a[4][j]+k;
				a[4][4]=a[4][4]+k;
				
				
				
			}
			
			
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
