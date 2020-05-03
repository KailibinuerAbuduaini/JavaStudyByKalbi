package Day020_String_manupilation;

public class String_replace_1 {

	public static void main(String[] args) {
		
    String sentence="Coding is fun, it is my hobby!";
    
    sentence= sentence.replace("!","!!!");
   System.out.println(sentence);
   
   
   String result="About 8,930,000,000 results(0.68 seconds)";
   result=result.replace(result,"8,930,000,000");
   result=result.replace("About","").replace("results(0.68 seconds)","");
   
   
   System.out.println(result);
	}

}
