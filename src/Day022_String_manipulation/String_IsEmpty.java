package Day022_String_manipulation;

public class String_IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "";
		String password = "";
		
		if(userName.isEmpty()) {
			System.out.println("Username field can not be empty");
		}else {
			System.out.println("Username is not empty");
		}
		
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be emoty");
		}else {
			System.out.println("Username or password is not empty");
		}

	}

}
