public class Milk {

	public static void main(String[] args) {
		int day = 1,sum=0;
		while(day<=30&&day%2==1) {
			sum = sum + 21;
			day = day+2;
		}
		System.out.println(sum);
	}

}
