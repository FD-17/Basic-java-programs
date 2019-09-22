import java.util.*;
public class GCD
{
    static int GCD(int a,int b){
        if(b==0)
        return a;
        return GCD(b,a%b);
    }
	public static void main(String[] args) {
        int n1,n2;
	    try(Scanner sc=new Scanner(System.in)){
	    n1=sc.nextInt();
	    n2=sc.nextInt();
    }
    int gcd=GCD(n1,n2);
    System.out.print("GCD of "+n1+" and "+n2+" is "+gcd);
        
	}
}
/*
Output:
n1=98
n2=56
GCD of 98 and 56 is 14
*/
