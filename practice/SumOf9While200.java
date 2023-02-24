package loop.practice;

public class SumOf9While200 {
	public static void main(String[] args) {
		SumOf9While200 obj=new SumOf9While200();
		int n=1;
		while(n<=200) {
			int n1=n%10;

			int n2=n/10;
			int n3=n1+n2;
			if(n3==9) {
				System.out.println(n3);
			}
	     	n++;
		}
		
		
		
		
		
	}

}
