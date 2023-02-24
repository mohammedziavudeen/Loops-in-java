package loop.practice;
//print prime number of 2to10 factorial
public class FactorialPrime {

	public static void main(String[] args) {
		FactorialPrime factObj=new FactorialPrime();
		int no=2;
		while(no<=10) {
			int num=factObj(no);
			//System.out.println(num);
			int result=factPrime(num);
			//System.out.println(num);
			if(result==0) {
				System.out.println("no "+no +" is prime"); }
			no++;
		}			
	}		
	

	private static int factPrime(int num) {
		int div=2,count=0;
		while(num>div) {
			if(num%div==0) {
				count++;				
			}
			div++;
		}
			return count;
	}

	private static int factObj(int no) {
		int fact=1;
		while(no>0) {
			fact=fact*no;
			no=no-1;
		}
		return fact;
	}

}
