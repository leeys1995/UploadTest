import java.util.Scanner;

public class sam_07 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int i=0;
		int s=0;
        
			
		
		
		while(true) {
			
			System.out.println("�����Է����ּ���:");	
			int a=scn.nextInt();
			if(a==0) break;
			i++;
			
			s=s+a;
			
		}
	    		
		System.out.println("�����Ǽ�:"+i);
		System.out.println("����:"+s);
	}

}
