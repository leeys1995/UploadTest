import java.util.Scanner;

public class sam_12 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int a = scn.nextInt();

		int n = 0;

		for (int i = 2; i <= a; i++) {

			n = a -(int)(a/i)*i;
					
			if(n==0) {
				
				if(a==i) {
					System.out.println("�Ҽ�");
					
				}
				else {
					System.out.println("�Ҽ��ƴ�");
				}
				break;
			}
		}

				
				
		
		
	}
}
