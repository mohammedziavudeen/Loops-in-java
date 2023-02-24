package loop.practice;

public class BintoDec extends Pattern5Decrease {

	public static void main(String[] args) {
		BintoDec BinObj=new BintoDec();
		BinObj.decimal(); //decimal to binary
		
		
		int n=101000,power=0,sum=0; //this method is for binary to decimal
		while(n>0) {
			int rem=n%10;
			int output=BinObj.patterMethod(2,power);
			sum=sum+(rem*output);
			n=n/10;
			power++;
		}
		System.out.println(sum);
		

	}

	private void decimal() {
		int n=1243;
		String binary="";
		while(n>0) {
			int rem=n%2;
			binary=rem+binary;
			n=n/2;
		}
		System.out.println("The Binary digit for this number="+binary);
		
	}

}
