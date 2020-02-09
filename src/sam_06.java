

public class sam_06 {

	public static void main(String[] args) {
		int i = 0, s = 0, sw = 0;

		do {
            i++;
            if(sw==0) {
            	s=s+i;
            	sw=1;
            }
            else {
            	
            	s=s-i;
            	sw=0;
            }
		} while (i < 10);
		
		System.out.println("+1-2+3-4+5-6+...-10 ÀÇÇÕ°è"+s);
	}

}
