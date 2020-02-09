
public class sam_27 {

	public static void main(String[] args) {
		
		int[] a = { 70, 60, 90, 80, 40, 44, 32, 22, 12 };
		int [] b=new int[9];
		
		for(int i=0;i<b.length;i++) {
			
			b[i]=1;
			
		}
        
		for(int x=0;x<a.length;x++) {
			
			for(int y=0;y<a.length;y++) {
				
				if(a[x]<a[y]) {
					
					b[x]=b[x]+1;
					
				}
				
			}
			
		}
		

		for (int x = 0; x < b.length; x++) {
			
			
			System.out.print("성적:"+a[x] + "\t");
			
			System.out.print("순위"+b[x] + "\t");
            System.out.println();
		}
		
	}

}
