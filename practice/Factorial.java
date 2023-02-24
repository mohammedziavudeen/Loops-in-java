package loop.practice;
//factorial of the number
public class Factorial {
	
	public static void main(String[] args) {
		Factorial factObj=new Factorial();
		int no = 5;
		while(no>=1)
		{
		int output = factObj.find_fact(no);
		System.out.println("Factorial of " + no + " is " + output);
		no = no - 1; 
		

  }
		//factObj.factorial();
	}
		private void factorial() {
		int num=1,fact=1;
		while(num<6) {
			fact=fact*num;
			num=num+1;
			
		}System.out.println(fact);
		
		
	}

		int find_fact(int no) {
			int fact=1;
			while(no>=1) {
				fact =fact*no;
				no=no-1;
			}
			return fact;
			
		}
		
	
}



