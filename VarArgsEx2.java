public class VarArgsEx2 {

	public static void main(String[] args) {
		show(4,6,8,7);
		show(3,4,7,8,0,6,8,5);
	}
	static void show(double b,int ... a) {
	//static void show(int ... a,double b) { //error
	//static void show(double ... b,int ... a) { //error
		
		System.out.print(b+"\t");
		for(int x:a) {
			System.out.print(x+"\t");
		}
		System.out.println();
	}
}