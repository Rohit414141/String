import java.util.Scanner;

public class CountPantuation {

	public static void main(String[] args) {
		/*Scanner sc  = new Scanner(System.in);
		int c=0;
            System.out.println("Enter the number:");
            String s  = sc.nextLine();
            for(int i=0;i<s.length();i++) {
            	if(s.charAt(i)==','||s.charAt(i)=='?'||s.charAt(i)==':'||s.charAt(i)=='.'){
            		c++;
            	}
            	
            			
            }
            System.out.println(c);
            */
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number:");
		String  s  = sc.nextLine();
		s  = s.toLowerCase();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==',' || s.charAt(i)==':'|| s.charAt(i)=='?') {
				c++;
			}
		}
		System.out.println(c);
	}

}
