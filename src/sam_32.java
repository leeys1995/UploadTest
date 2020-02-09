
public class sam_32 {

	public static void main(String[] args) {
	
		int [][] a= new int[5][5];
		
		int k=0;
		int z=0;
		
		for(int i=0;i<5;i++) {
			
			
			for(int j=4-i;j<5;j++) {
				
				k++;
				
				a[i][j]=k;
				
				
			}
		}
		
		for(int x=0; x<5;x++) {
			
			for(int y=0; y<5;y++) {
				
			System.out.print(a[x][y]+"\t");
			
			
			z++;
			}
			if(z==5 ) {
				
				System.out.println();
				z=0;
				
			}
			
		}
	
		
	
	}
}
		   

		       
		        
		      
		        
		       
		           
		         
		        
	

