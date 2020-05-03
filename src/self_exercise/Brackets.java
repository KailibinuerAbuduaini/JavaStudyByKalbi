package self_exercise;

import java.util.Stack;

public class Brackets {
	/*
	 * Write a function called validBraces that takes a string of braces, and determines if the order of the braces is valid. 
validBraces should return true if the string is valid, and false if it's invalid.
All input strings will be nonempty, and will only consist of open parentheses '(' , closed parentheses ')', open brackets '[', closed brackets ']',
 open curly braces '{' and closed curly braces '}'.
What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace. For example:
'(){}[]' and '([{}])' would be considered valid, while '(}', '[(])', and '[({})](]' would be considered invalid.
Specification
Challenge.validBraces(braces)
Checks if the brace order is valid
Parameters
braces: String - A string representation of an order of braces
Return Value
boolean - Returns true if order of braces are valid
Examples:
Input    Output
validBraces( "(){}[]" )      true      
validBraces( "(}" )            false     
validBraces( "[(])" )         false     
validBraces( "([{}])" )      true

	 */

	

		    @SuppressWarnings("deprecation")
			public static boolean brackets(String braces) {
		 
				Character character1 = new Character('0');
		        Character character2 = new Character('0');
		        Stack<Character> stack = new Stack<Character>();
		        Stack<Character> stackReverse = new Stack<Character>();
		        Stack<Character> temp = new Stack<Character>();
		        for (int a = 0; a < braces.length(); a++) {
		            stack.push(braces.charAt(a));
		        }
		        for (int a = 0; a < braces.length(); a++) {
		            temp.push(braces.charAt(a));
		        }
		        Character c;
		        for (int b = 0; b < braces.length(); b++) {
		            c = temp.pop();
		            stackReverse.push(c);
		        }
		        boolean flag=true;
		        while (!stack.isEmpty()&&(flag)) {
		            character1 = stack.pop();
		            character2 = stackReverse.pop();
		            if (character1 == '(' && character2 == ')')
		                flag= true;
		            else if (character1 == ')' && character2 == '(')
		                flag=true;
		            else if (character1 == '{' && character2 == '}')
		                flag= true;
		            else if (character1 == '}' && character2 == '{')
		                flag=true;
		            else if (character1 == '[' && character2 == ']')
		                flag=true;
		            else if (character1 == ']' && character2 == '[')
		                flag=true;
		            else
		                flag=false;
		        }
		        return flag;
		    }
		    public static void main(String[] args) {
		        System.out.println(brackets("(){}[][]{}()"));
		        System.out.println(brackets("{[()]}"));
		        System.out.println(brackets("{([({{{{]])}]}"));
		    }
		}

	

