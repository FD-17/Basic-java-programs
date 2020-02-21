import java.util.*;
public class Balancing_Paranthesis
{
	public static void main(String[] args) {
String s="{[]}{}{{}}[]";

Stack <Character> st=new Stack<Character>();
for(int i=0;i<s.length();i++){
    if(Character.isDigit(s.charAt(i)) ||Character.isLetter(s.charAt(i)))
      continue;
    if(s.charAt(i)=='{'|| s.charAt(i)=='('||s.charAt(i)=='['){
        st.push(s.charAt(i));
    }
    else{
        if(st.isEmpty()||((s.charAt(i)=='}' && st.pop()!='{')|| (s.charAt(i)==')' && st.pop()!='(') ||(s.charAt(i)==']' && st.pop()!='['))){
        System.out.println("Not Balanced");
        return;
        }
    }
}
if(st.isEmpty())
System.out.print("Balanced");
else
System.out.print("Not Balanced");
	}
}
