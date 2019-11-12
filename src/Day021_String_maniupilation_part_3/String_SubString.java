package Day021_String_maniupilation_part_3;

public class String_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//substring 0 din baxlap sanaymiz;
		//length 1 din baxlap sanaymiz
		String sentence="java strin manipulation is fun!";
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5,sentence.length()-5));
		
		String chars="{{}}";
		String word="automation";
		
		String result = chars.substring(0, 2) + word + chars.substring(2);
		System.out.println(result);
		
		System.out.println(word.toUpperCase());
		
		String str=" 342 ";
		 System.out.println("|"+str.trim()+"|");
		 
		
	}

}
