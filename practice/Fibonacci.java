package loop.practice;

public class Fibonacci {

	public static void main(String[] args) {
		int first=0,second=1;
		int third=first+second;
		while(first<30){
		System.out.println(first);
		
		first=second;
		second=third;
		}
	}
	
}
