
public class sam_10 {

	public static void main(String[] args) {
		int s = 0;
		int t = 0;
		int sw = 0;

		for (int i = 0; i <= 100; i++) {

			if (sw == 0) {

				t = t + i;
				sw = 1;
			}
			else if (sw == 1) {

				s = s + i;
				sw = 0;
			}

		}
		System.out.println("(1~100)È¦¼öÀÇÇÕ:"+t);
		System.out.println("(1~100)Â¦¼öÀÇÇÕ:"+s);

	}

}
