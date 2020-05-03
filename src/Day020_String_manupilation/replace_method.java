package Day020_String_manupilation;

public class replace_method {

	public static void main(String[] args) {
		

		String str="Moscow isa capital of Russia";
		str=str.replace("Moscow", "Baku").replace("Russia", "Azarbaijan");
	
		System.out.println(str);
		
		String email="firstName_Last_name@gmail.com";
		String company="capitalone";
		String newEmail=email.replace("gmail", company);
		System.out.println(newEmail);
		System.out.println(email);
	}

}
