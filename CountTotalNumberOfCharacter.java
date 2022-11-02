import java.util.Scanner;

public class CountTotalNumberOfCharacter {

	public static void main(String[] args) {
		/*Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s   =sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
		*/
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the name:");
		String s  = sc.nextLine();
		s  = s.toLowerCase();
		int c = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.println(c);
	}

}
