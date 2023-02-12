//this program is to find the profit percentage for travelling auto&bus and only auto

public class BusFair {
	int SA=20,bus=30,sum1=0,sum2=0,day1=1,day2=1; //SA refers to ShareAuto,Sum1 for the calculate the sum for Bus and auto fair,Sum2 to calculate the auto fair only,same for day1 and day2
	public static void main(String[] args) {
		
		BusFair b1 = new BusFair();
		b1.busauto();
		//b1.bus();
	}
	
		
		void busauto() {
		while (day1<=22) {
			sum1 = sum1 + bus + SA;//calculating the sum both auto and bus
			day1 = day1+1;
			}
		System.out.println("Total amount for Bus and auto:" +sum1); 
	
		while (day2<=22) { 
			sum2 = sum2 + SA; //calculating the sum for auto only
			day2 = day2+1; 
		}
		 
		System.out.println("Total amount for auto only:" +sum2);
		double profitamount = sum1 - sum2;  
	    	double profitPercentage = (profitamount / sum1) * 100;
		System.out.println("Profit percentage: " + profitPercentage);
}
}

