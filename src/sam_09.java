import java.util.Scanner;

public class sam_09 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("기준값을 입력하세요:");
		int a=scn.nextInt();
		
		int max=a;
		int min=a;
		
		while(true) {
			System.out.println("상대값을 입력하세요:");
			int b=scn.nextInt();
			if(b==-99) break;
			
			if(max<b) {
				max=b;
				
			}
			if(min>b) {
				
				min=b;
			}
		}

		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);
	}

}
