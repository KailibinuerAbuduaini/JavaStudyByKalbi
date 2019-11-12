/*
 * 
 */



package Day019_String_manipulation;

public class Task_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String word="abcabaqcabaca";
       char mychar='a';
        int counter=0;
 
     for(int i=0;i<word.length();i++) {
	   if(word.charAt(i)==mychar) {
		   
		counter++;
	}
	
}
     System.out.println("Count for "+mychar+" is "+counter+" times.");
	}

}
