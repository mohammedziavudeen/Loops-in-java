package loop.practice;

public class SumOfN {

	public static void main(String[] args) {
		int n=1,sum=0;
		int num=10,summ=0;
		while(n<=10) {
			sum=sum+n;
			n=n+1;
		}
		System.out.println(sum);
	
		while(num<=10)  {
			summ=summ+num;
			num=num-1;
			System.out.println(summ);
	
		}
	}	
}

