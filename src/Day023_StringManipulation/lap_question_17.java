package Day023_StringManipulation;

public class lap_question_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Taco cat";  //tac ocaT
		
		String dummy="";
		
		//forwardString.equals(backwarString) =true    
		
		//  m + a + d + a + m
		//  4   3   2   1   0
		
		//  m + o + m
		//  2   1   0
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
			dummy = dummy + str.charAt(i);    // "" + m
			                                  // m + a = ma
			                                  // ma + d = mad
		}//wow
		
		if(str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}







	}

}
