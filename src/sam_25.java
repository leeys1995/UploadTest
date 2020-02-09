
public class sam_25 {

	public static void main(String[] args) {
		int[] a = { 70, 60, 90, 80, 40, 44, 32, 22, 12 };
        
		int sw=0;
		for (int i = 0; i < a.length ; i++) {


			for (int j = 0; j < a.length-i -1; j++) {

				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					sw=1;
				}
				if(sw==0)break;

			}

		}
		for (int x = 0; x < a.length; x++) {

			System.out.print(a[x] + "\t");

		}

	}

}
