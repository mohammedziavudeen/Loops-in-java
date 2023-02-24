package loop.practice;

public class LCM {

	public static void main(String[] args) {
		int no1=3,no2=11;
		boolean first=true;
		int big=no1>no2?no1:no2;
		while(first==true)   {
		if(big%no1==0 && big%no2==0)
		{
			System.out.println(big);
			first=false;
		}
		big=big+1;

	}
	}
}
