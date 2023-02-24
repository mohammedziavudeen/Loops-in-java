package loop.practice;

public class Factorial1 {

	public static void main(String[] args) {
		Factorial1 factObj = new Factorial1();
		int n=5;
		int result=factObj.fact(n);
		System.out.println(result);
		n=n-1;
		
	}
	
		int fact(int n)
		{
		int fact=1;
		while(n>=1) {
			fact=fact*n;
			n=n-1;
		}
		return fact;
		
		}	
	

}
}