import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);
     int c=0;
     System.out.println("Enter the String:");
     String s  = sc.nextLine();
     for(int i=s.length()-1;i>=0;i--) {
    	 System.out.print(s.charAt(i));
    	 if(s.charAt(i)==' ') {
    		 c++;
    		 
    		 
    	 }
    	 
     }
     System.out.println();
     System.out.println("space"+ c);
     
	}

}
