import java.util.Scanner;

public class sam_09 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("���ذ��� �Է��ϼ���:");
		int a=scn.nextInt();
		
		int max=a;
		int min=a;
		
		while(true) {
			System.out.println("��밪�� �Է��ϼ���:");
			int b=scn.nextInt();
			if(b==-99) break;
			
			if(max<b) {
				max=b;
				
			}
			if(min>b) {
				
				min=b;
			}
		}

		System.out.println("�ִ밪 :"+max);
		System.out.println("�ּҰ� :"+min);
	}

}
