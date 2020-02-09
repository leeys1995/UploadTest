import java.util.Scanner;

public class sam_22 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int [] a= new int[10];
		int i=0;
		
		for(int j=0;j<10;j++) {
			
			System.out.println("정수입력");
			a[j]=scn.nextInt();

		}
       
		while(i<10) {
			
			System.out.print(a[i]+"\t");
			i++;
			
		}
	}

}
