
public class sam_23 {

	public static void main(String[] args) {

		int[] a = { 70, 60, 90, 80, 40, 44, 32, 22, 12 };

		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if(a[i]>a[j])  {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + "\t");

		}
		
	
				
		
	}

}
