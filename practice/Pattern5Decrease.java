package loop.practice;
//to print 5power4 4power3 3power2 2power1 1power0
//to print 2power5 2power4 2power3 2power2 2power1
public class Pattern5Decrease {

	public static void main(String[] args) {
		Pattern5Decrease patternObj=new Pattern5Decrease();
		int n=5,power=4;
		while(n>0) {
			int output=patternObj.patterMethod(n,power);
			System.out.println(n+ "power" +power+ "=" +output);
			n=n-1;
			power=power-1;
		}
		int no=2,powers=5,count=1;
		while(count<=5) {
			patternObj.patternMethod1(no,powers);
			powers=powers-1;
			count=count+1;
		}

	}

		void patternMethod1(int no, int powers) {
		int result=1;
		while(powers>0) {
			result=result*no;
			powers=powers-1;
		}	System.out.println(result);
		
	}

	int patterMethod(int n, int power) {
		int result=1;
		while(power>0) {
			result=result*n;
			power=power-1;
		}   return result;//System.out.println(result);
		
	}

}
