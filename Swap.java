import java.util.*;
public class Swap
{
    
	public static void main(String[] args) {
        int n1,n2;
	    try(Scanner sc=new Scanner(System.in)){
	    n1=sc.nextInt();
	    n2=sc.nextInt();
    }
    n1=(n1+n2)-(n2=n1);
    System.out.println("Before swap"+n1+" and "+n2);
    System.out.println("Before swap"+n2+" and "+n1);
	}
}
/*
Output:
n1=15
n2=25
Before swap25 and 15
Before swap15 and 25
*/
