import java.util.Scanner;

public class sam_08 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int max =0;
		int min = 999;
		
		while(true) {
			
			System.out.println("�����Է����ּ���:");
			int a=scn.nextInt();
			
			if(a==-99) break;
			
			if(max<a) {
				
				max=a;
			}
			if(min>a) {
				
				min=a;
			}
			
		}
		System.out.println("�ִ밪"+max);
		System.out.println("�ּҰ�"+min);

	}

}
