import java.util.Scanner;

public class sam_40 {

	public static void main(String[] args) {
		int [] a= new int[10];
		int i=0;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("2진수로변환할 숫자를입력하세요:");
		int n=scn.nextInt();
		
		while(n>0) {
			
			int m=(int)n/2;
			int g=n-(m*2);
			
			i=i+1;
			a[i]=g;
			n=m;
			
			
			
			
		}
		for(int l=i;l>0;--l) {
			
			System.out.print(a[l]+"\t");
			
		}
	}

}
