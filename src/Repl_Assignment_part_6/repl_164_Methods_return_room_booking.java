package Repl_Assignment_part_6;

public class repl_164_Methods_return_room_booking {

	public static void main(String[] args) {
		System.out.println(simpleRoomBook(true,7,2,2018));

	}
	public static  boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
	    if(isAvailable==false&&month==7&&day>=1&&day<=8&&year==2018) {
	    	
	    	return false;
	   
	    }else if(isAvailable==true&&month==7&&day>=1&&day<=8&&year==2018) {
	    	return false;
	    }else if(isAvailable==true&&month>=1&&day>=1&&year==2018) {
	    	return true;
	  }
		return false;
	  }
}
