package loop.practice;
//Prime Numbers between 2 and 20
public class Prime {

	public static void main(String[] args) {
		Prime primeObj = new Prime();
		int n=2;
		while(n<=20)  {
		int result = primeObj.objMethod(n);
		if (result==0) {
			System.out.println(n);
		}
		n=n+1;		
	}
		
	}
	
	private int objMethod(int n) {
		int div=2,count=0;
		while(n>div) {
			if(n%div==0) {
			count=count+1;
		} div=div+1;
		}
		return count;
		
	}
	}



