public class StringExample3 {
public static void main(String[] args) {
		String s1 = new String("Rohit");//heap memory bnegi heap me new memory banti he data same ho to bhi
		String s2 = "Rohit";// pool me same bnegi agar data same he 
		String s3 = new String("Rohit");
		String s4 = "Rohit";
		String s5 = new String("Rohit");
		String s6 = "Rohit";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s1==s3);//false compares the reference value not data)
		System.out.println(s2==s4);//true compares the reference value not data)
		System.out.println(s1.equals(s3));//true
		System.out.println(s2.equals(s4));//true
		

	}
}



