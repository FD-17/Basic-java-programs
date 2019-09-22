import java.util.*;
public class lcm
{
    static int GCD(int a,int b){
        if(b==0)
        return a;
        return GCD(b,a%b);
    }
    static int LCM(int a,int b){
        return (a*b)/GCD(a,b);
    }
	public static void main(String[] args) {
        int n1,n2;
	    try(Scanner sc=new Scanner(System.in)){
	    n1=sc.nextInt();
	    n2=sc.nextInt();
    }
    int result=LCM(n1,n2);
    System.out.print("LCM of "+n1+" and "+n2+" is "+result);
    
        
	}
}
/*
Output:
n1=15
n2=25
LCM of 15 and 25 is 75
*/
