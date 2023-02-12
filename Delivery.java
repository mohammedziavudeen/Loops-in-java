//This program to find the charges for newspaper for 30 days,whereas per day= Rs.7.
public class Delivery {

	public static void main(String[] args) {
		int day=1,rupees=0;
		while(day<=30) {
			rupees = rupees+7;
			day = day+1;
		}
			int TotalAmount=rupees+30;//30 for delivery charge
		System.out.println(TotalAmount);

	}

}

