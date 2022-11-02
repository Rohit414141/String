public class VarArgsExample1 {

	public static void main(String[] args) {
		add(4,6,8);
		add(4,6);
		add(4);
		add();
		add(new int[] {5,3,5,78,9,2});
	}
	static void add(int ... a) {
		int sum=0;
		for(int x:a) {
			sum +=x;
		}
		System.out.println("SUM: "+sum);
	}

}