import java.util.*;
public class Prime_Numbers
{
	public static void main(String[] args) {
      int n;
	    try(Scanner sc=new Scanner(System.in)){
	    n=sc.nextInt();}
	    if (n>0 && n<=2){
	        System.out.print("Prime");
	        return;
	    }
	    for(int i=2;i<=(int)Math.sqrt(n);i++){
	        if(n%i==0){
	        System.out.print("Not a Prime");
	        return;
	        }
	    }System.out.print("Prime");
	}
}

/*Output:
n=5
Prime
*/
