import java.util.*;
public class Integer_Reverse
{
	public static void main(String[] args) {
        int n;
	    try(Scanner sc=new Scanner(System.in)){
	    n=sc.nextInt();
	    }
	    int sum=0,rem;
	    while(n>0){
	        rem=n%10;
	        sum=sum*10+rem;
	        n=n/10;
	    }
	    System.out.print(sum);
	}
}
/*
Output:
s=334 
Reversed Integer:433
*/
