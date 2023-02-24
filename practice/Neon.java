package loop.practice;

public class Neon {
	
	public static void main(String[] args) {
		
		int n=9;
		int sq=n*n,sum=0;
		while(sq>0) {
			int unit=sq%10;
			sum=sum+unit;
			sq=sq/10;
			
		}
		if(sum==n)
		System.out.println("This number is neon and Sum of the digits="+sum);
		else
			System.out.println("This number is not neon and sum of the digits="+sum);

	}
	
	// 

}
