import java.util.Scanner;

public class sam_21 {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		
		int [] a= new int[10];
		
	    int i=0;
	    
	    for(int x=0; x<10;x++) {
	    	System.out.println("정수를 입력하세요:");
	    	a[x] =scn.nextInt();
	    
	    	i++;
	    	
	    	if(i==10)break;
	    	
	    }
		
        for(int j=0;j<10;j++) {
        	
        	System.out.print(a[j]+"\t");
        	
        }
	}

}
