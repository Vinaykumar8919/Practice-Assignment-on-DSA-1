import java.util.*;
class Solution{
    public static boolean valid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == '{' || c == '[' || c == '(') {
            stack.push(c);
        } else {
            if (stack.isEmpty())
                return false;
            char top = stack.pop();
            if ((c == '}' && top != '{') || (c == ']' && top != '[') || (c == ')' && top != '('))
            return false;
        }
    }
    
    return stack.isEmpty();
}
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(valid(input));
		}
		
	}
}



