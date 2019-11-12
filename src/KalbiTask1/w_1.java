package KalbiTask1;

public class w_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s="javascript string quiz";
//System.out.println(s.charAt(s.length()-6));
//System.out.println(s.substring(3, 3));
//
//String s1="javascript"+1+2+ "quiz"+""+(3+4);
//System.out.println(s1);
//String s2="0123";
//System.out.println(s2.substring(3));

String s4="purr";
s4.toUpperCase();
s4.trim();
s4.substring(1,3);
s4+=" two";
System.out.println(s4.length());
	System.out.println("|"+FunCharSeq(" w ").concat("w")+"|" );
	}
public static String FunCharSeq(String str) {
	str=str.trim();
	str+=0;
	return str;			
}

}
