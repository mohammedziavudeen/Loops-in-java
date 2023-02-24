package loop.practice;
//Palindrome program
public class Palindrome {

	public static void main(String[] args) {
		int num=45673189,sum=0; 
				while(num>0) {
					int unit=num%100;
					sum=sum*100+unit;
					num=num/100;				}
				System.out.println(sum);
					

	}

}
