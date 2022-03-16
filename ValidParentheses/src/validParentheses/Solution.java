package validParentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        //Create a stack
    	Stack<Character> stack = new Stack<>();
    	//iterate over all chars available in the string
    	for(int i = 0; i < s.length(); i++) {
    		char ch = s.charAt(i);
    		//if we find opening put it in the stack
    		if (ch == '(' || ch == '{' || ch == '[') {
    			stack.push(ch);
    		}//find closing out of 3 conditions
    		else if(ch == ')') {
    			//if stack is empty, return false
    			if(stack.isEmpty()) return false;
    			//if opening element desired =/= to what is present in the stack, return false
    			else if(stack.peek() != '(') return false;
    			//if it's the one we want, pop it
    			else stack.pop();
    		}//create a similar structure for the rest
    		else if(ch ==']') {
    			if(stack.isEmpty()) return false;
    			else if(stack.peek() != '[') return false;
    			else stack.pop();
    		}
    		else if(ch == '}') {
    			if(stack.isEmpty()) return false;
    			else if(stack.peek() != '{') return false;
    			else stack.pop();
    		}
    	}
    	if(stack.isEmpty()) return true;
    	return false;
    }
}