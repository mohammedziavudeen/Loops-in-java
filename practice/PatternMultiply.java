package loop.practice;
//to print 1*10 2*9 3*8 4*7 5*6
public class PatternMultiply {

	public static void main(String[] args) {
		int no=1;
		while(no<=5) {
			int result = no*(11-no);
			System.out.println(result);
			no=no+1;
		}
		

	}

}
