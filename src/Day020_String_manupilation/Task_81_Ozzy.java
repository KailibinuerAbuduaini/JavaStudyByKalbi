package Day020_String_manupilation;

public class Task_81_Ozzy {

	public static void main(String[] args) {
		
  String time = "10/01/2019 15:42:00";
		
		System.out.println(timeStamp(time));
	}
	
	public static String timeStamp(String time) {
		
		time = time.replace("/", "").replace(":", "").replace(" ", "");
		
		return time;
		//return ni exlatti
	
	}

}
