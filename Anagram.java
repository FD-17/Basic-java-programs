import java.util.*;
public class Anagram
{
	public static void main(String[] args) {
        String n1,n2;
	    try(Scanner sc=new Scanner(System.in)){
	    n1=sc.nextLine();
	    n2=sc.nextLine();
	    }int v=0;
	    if(n1.length()!=n2.length())
	    {
	        System.out.print("Not a Anagram");
	        return;
	    }
	    for(int i=0;i<n1.length();i++){
	        v=v^(int)n1.charAt(i);
	        v=v^(int)n2.charAt(i);
	    }if(v==0){
	        System.out.print("Anagram");
	    }
	    else{
	        System.out.print("Not a Anagram");
	    }
        
	}
}
/*
Output:
n1=abba
n2=bbaa
Anagram
*/
