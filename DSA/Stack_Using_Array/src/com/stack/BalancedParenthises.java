package com.stack;

public class BalancedParenthises {

	
	    public static boolean isBalancedParentheses(String inputString) {
	        CharStack stack = new CharStack(inputString.length());

	        for (char c : inputString.toCharArray()) {
	            if (c == '(' || c == '[' || c == '{'||c=='<') {
	                stack.push(c);
	            } else if (c == ')' || c == ']' || c == '}'||c=='>') {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char top = stack.pop();
	                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')||(c=='>'&&c=='<')) {
	                    return false;
	                }
	            }
	        }
//end of for loop
	        return stack.isEmpty();
	    }

	    public static void main(String []args) {
	    	
	        String test = "<>";
	        if (isBalancedParentheses(test)) {
	            System.out.println("balanced.");
	        } else {
	            System.out.println("Not balanced");
	        }
	    }
	}


