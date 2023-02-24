package loop.practice;

public class PrimeDev {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    PrimeDev priobj=new PrimeDev();
	    priobj.dev(100);
	  }

	  private void dev(int no) {
	    // TODO Auto-generated method stub
	    int d=2;
	    while(d<no) {
	      if(no%d==0) {
	    	  System.out.println(d);
	      int result=primefact(d);
	      if(result==0) {
	        System.out.println("Divisor of 100 and prime="+d);   
	      }
	      }
	      d=d+1;
	    }
	  }

	  private int primefact(int d) {
	    // TODO Auto-generated method stub
	    int i=2;
	    int count=0;
	    while(d>i) {
	      if(d%i==0)
	      {
	        count=count+1;
	      }
	      i=i+1;
	    }
	    return count;
	  }
}