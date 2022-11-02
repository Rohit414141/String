//mutable String
public class StringExample7 {

	public static void main(String[] args) {
/*	//	StringBuffer a = new StringBuffer("Rohit");
		StringBuilder a = new StringBuilder("Rohit");
		a.append("mishra");
		System.out.println(a);
		a.insert(2, "lakkhe");
		System.out.println(a);
		a.reverse();
		System.out.println(a);
		a.replace(2, 8, "india");
		System.out.println(a);
		a.delete(2, 8);
		System.out.println(a);
		
		*/
		
		
	StringBuffer a  = new StringBuffer("Rohit ");
	//StringBuilder  a  = new StringBuilder("Rohit");
	a.append("Mishra");
	System.out.println(a);
	a.insert(0, 1);
	System.out.println(a);

	System.out.println(a);
	a.replace(2, 8, "india");
	System.out.println(a);
	a.delete(2, 8);
	System.out.println(a);
	

	}

}

