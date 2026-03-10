package stack;
import java.util.Stack;
public class checkparenthsis {
	  static boolean isBalanced(String expr) {
	        Stack<Character> st = new Stack<>();
	        for (int i = 0; i < expr.length(); i++) {
	            char ch = expr.charAt(i);
	            if (ch == '(' || ch == '{' || ch == '[') {
	                st.push(ch);
	            }
	            else if (ch == ')' || ch == '}' || ch == ']') {
	                if (st.isEmpty())
	                    return false;
	                char top = st.pop();
	                if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }
	        return st.isEmpty();
	    }

	    public static void main(String[] args) {
	        String expr = "{(a+b)*c[d]{}}}";
	        if (isBalanced(expr))
	            System.out.println("Balanced");
	        else
	            System.out.println("Not Balanced");
	    }
	}

