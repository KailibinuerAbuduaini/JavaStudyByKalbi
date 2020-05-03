package Repl_Assignment_part_6;

public class repl_169_Methods_String_wordcount {

	public static void main(String[] args) {
		/*
		 * This method gets a string and returns the word count of that string.
		 */
System.out.println(wordCount("one two three"));
		

	}
	  public static int wordCount(String words) {
		  int wordCount = 1;
		  for (int i = 0; i < words.length(); i++) 
          {
              if (words.charAt(i) == ' ') {
                  wordCount++;
              }
          }

          return wordCount;
  }
	  public static int wordCount(String words) {
		  String[]arr=words.split(" ");
		  return arr.length;
	  }
	      
	  }
	  

