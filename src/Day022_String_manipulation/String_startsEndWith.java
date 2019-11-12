package Day022_String_manipulation;

public class String_startsEndWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Mr.=>married man
		// Mrs.=> married woman
//		Ms.=> some woman
//		Dr.=> Doctor man or woman
//		no title=> unknown status
		
		String s="Mr.maike";
		if(s.startsWith("Mr.")){
			System.out.println("married man");
		}else if(s.startsWith("Ms.")) {
			System.out.println("some woman");
		}
	}

}
