import java.util.*;
public class Fibanocci
{
    static int fib(int n){
        if(n<2)
        return n;
        return fib(n-1)+fib(n-2);
    }
	public static void main(String[] args) {
        int n;
	    try(Scanner sc=new Scanner(System.in)){
	    n=sc.nextInt();}
	    System.out.print("Fibanocci of "+n+" is "+fib(n));
	}
}

/*Output:
n=13
Fibanocci of 13 is 233*/
