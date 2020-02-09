
public class sam_05 {

	public static void main(String[] args) {
		int i=0;
		int s=0;
		int y=1;
		
        do {
        	i++;
        	
        	int m=i*y;
        	s=s+m;
        	y=y*-1;
        }while(i<10);
        
        System.out.println("+1-2+3-4+5-6+...-10 ÀÇ ÇÕ°è:"+s);
	}

}
