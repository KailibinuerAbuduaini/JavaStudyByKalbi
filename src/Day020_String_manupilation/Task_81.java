package Day020_String_manupilation;

public class Task_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  date("10/10/2019 14:59:00");// method chaqaduq
	}
   public static void date(String date) {
   date=date.replace("/","").replace(":", "").replace(" ", "");

System.out.println(date);
	
}
}
