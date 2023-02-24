package loop.practice;
//to find LCD and GCD
class CommonDivisor{
	int no1=100,no2=60;

	public static void main(String[] args) {
		CommonDivisor loopingobj=new CommonDivisor();
		loopingobj.gcd(100,60);//this method to find greatest divisors of two numbers
		loopingobj.lcd(100,60);//this method to find both the greatest and least divisors of two numbers
	}
		private void lcd(int no1,int no2) {
		int small=no1<no2?no1:no2,divisor=2,gcd=0;
		boolean first =true;
		while(small>=divisor) {
			if(no1%divisor==0 && no2%divisor==0) {
				if(first==true) {
			
				System.out.println("LCD="+divisor);
				first=false;
				divisor=divisor+1;
				continue;
				}
				gcd=divisor;
				System.out.println("GCD="+gcd);				
		
		}
			divisor=divisor+1;
			
		} }
		void gcd(int no1,int no2) {
		//int no1=100,no2=60,divisor=2;
			
		int small=no1<no2?no1:no2,divisor=2;
		while(small>=divisor) {
			if(no1%divisor==0 && no2%divisor==0)
				System.out.println(divisor);
			divisor=divisor+1;
		}
		
		
	}

}
