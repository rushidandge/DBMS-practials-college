import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	    System.out.println(" enter number");
	    
	    int num=sc.nextInt();
	    int temp=0;
	    
	
	    int loop=2;
	  while(loop<= num/2)
	  {
	      if(num%loop==0)
	      {
	          temp++;
	          break;
	      }
	      loop++;
	      
	  }
	      if(temp==0 && num!=1)
	      {
	          System.out.println(num+" is a prime number");
	      }
	      
	      else
	        System.out.println(num+" is not prime number");
	  }
}
