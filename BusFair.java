

public class BusFair {
	int SA=20,bus=30,sum1=0,sum2=0,day1=1,day2=1;
	public static void main(String[] args) {
		
		BusFair b1 = new BusFair();
		b1.busauto();
		//b1.bus();
	}
	
		
		void busauto() {
		while (day1<=22) {
			sum1 = sum1 + bus + SA;
			day1 = day1+1;
			}
		System.out.println("Total amount for Bus and auto:" +sum1); 
	
		while (day2<=22) { 
			sum2 = sum2 + SA;
			day2 = day2+1; 
		}
		 
		System.out.println("Total amount for auto only:" +sum2);
		double profitamount = sum1 - sum2;
	    double profitPercentage = (profitamount / sum1) * 100;
		System.out.println("Profit percentage: " + profitPercentage + "%");
}
}

