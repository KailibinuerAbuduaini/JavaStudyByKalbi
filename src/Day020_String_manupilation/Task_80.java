package Day020_String_manupilation;

public class Task_80 {

	public static void main(String[] args) {
		
		checkedString("your order confirmation number is XYZ","confirmation");
	}
public static void checkedString(String str1,String str2) {
	
	if(str1.contains(str2)) {
		System.out.println("yes "+str1.indexOf(str2));// index ni 0 din baxlap sanay miz;
	}else {
		System.out.println("no");
	}
}

}
