
public class test_01 {

	public static void main(String[] args) {

		int[] a = {12,32,36,42,5,92,7,8,82,62};
		int[] b = {11,42,15,14,62,16,17,62,19,20,35,22,33,24,25};
		int[] c = new int[25];
		
		int i=0, j=0, k=0;
		
		while(i<10 && j<15) {
			
			if(a[i] <= b[j]) {
				c[k] = a[i];
				i++;
			}else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		
		if(i<10) {
			do {
				c[k] = a[i];
				k++;
				i++;
			}while(i < 10);
		}else {
			do {
				c[k] = b[j];
				k++;
				j++;
			}while(j < 15);
		}
		
		print(c);
	}
	
	static void print(int[] c) {
		for(int l=0; l<c.length; l++) {
			if(l != 0 && l%5 ==0)
				System.out.println();
			
			System.out.print(c[l] + "\t");
		} 
	}

}
