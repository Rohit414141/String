import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		String s1  = "Brag";
		String s2  = "Grab";
		
		s1  = s1.toLowerCase();
		s2  = s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("not anagram:");
		}else {
			
			char []ss1 = s1.toCharArray();
			char []ss2  = s2.toCharArray();
			
			Arrays.sort(ss1);
			Arrays.sort(ss2);
			
			if(Arrays.equals(ss1, ss2)==true) {
				System.out.println("Anagram");
			}else {
				System.out.println("not angram:");
			}
		}
				
		
	}

}
