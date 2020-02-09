import java.util.Scanner;

public class sam_07 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int i=0;
		int s=0;
        
			
		
		
		while(true) {
			
			System.out.println("정수입력해주세요:");	
			int a=scn.nextInt();
			if(a==0) break;
			i++;
			
			s=s+a;
			
		}
	    		
		System.out.println("누적건수:"+i);
		System.out.println("총합:"+s);
	}

}
