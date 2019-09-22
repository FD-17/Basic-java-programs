import java.util.*;
public class Palindrome
{
	public static void main(String[] args) {
        String s;
	    try(Scanner sc=new Scanner(System.in)){
	    s=sc.nextLine();
	    }
	    if(s.equals(new StringBuffer(s).reverse().toString()))
        System.out.print("Palindrome");
        else
        System.out.print("Not a Palindrome");
	}
}

