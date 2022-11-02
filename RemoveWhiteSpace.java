import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
//    String s  = "rohit kumar Misra";
//    s  = s.replace(" ", "");
//    System.out.println(s);
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String");
		String str  = sc.nextLine();
		str  = str.replace(" ", "");
		System.out.println(str);
	}

}
