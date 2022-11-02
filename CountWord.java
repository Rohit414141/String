import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
	/*	int count=1;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String words");
      String s  = sc.nextLine();
      for(int i=0;i<s.length();i++) {
    	  if(s.charAt(i)==' ')
    		  count++;
      }
      System.out.println(count);*/
		
		
		int count=1;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the words:");
		String s  = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
