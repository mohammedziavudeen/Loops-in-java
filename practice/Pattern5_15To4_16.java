package loop.practice;

public class Pattern5_15To4_16 {
//5 15 20 25 4 8 12 16 20
	public static void main(String[] args) {
		Pattern5_15To4_16 patObj = new Pattern5_15To4_16();
		patObj.patMet();
	}
			
		private void patMet() {
		int no=1,div=5,end=25;
		while(no<=end) {
			if(no%div==0)
			{System.out.println(no); }
			no++;
			if(no==26) { 
			 no =1;
			 div=4;
			 end=20;
			continue;  }
			
			
		}		
	}			
}
