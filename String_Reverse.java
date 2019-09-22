import java.util.*;
public class String_Reverse
{
	public static void main(String[] args) {
        String s;
	    try(Scanner sc=new Scanner(System.in)){
	    s=sc.nextLine();
	    }
	    String s1="";
	    for(int i=s.length()-1;i>=0;i--){
	        s1+=s.charAt(i);
	    }
	    System.out.print(s1);
	}
}
/*
Output:
s=abc 
Reversed String:cba
*/
