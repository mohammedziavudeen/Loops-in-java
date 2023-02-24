package loop.practice;
//To find cube of the number
public class Cube {

	public static void main(String[] args) {
		int n=4,result=1;
		int power=3;
		while(power>0) {
			result=result*n;
			power=power-1;
		}
		System.out.println(result);
  }
}
	
