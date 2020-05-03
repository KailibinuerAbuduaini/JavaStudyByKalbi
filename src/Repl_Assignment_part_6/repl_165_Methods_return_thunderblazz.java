package Repl_Assignment_part_6;

public class repl_165_Methods_return_thunderblazz {

	public static void main(String[] args) {
		System.out.println(getThunderBlazz(false,false,3,1,1));
		System.out.println(getThunderBlazz(false,true,9,7,3));
		System.out.println();

	}
	 public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 
			  , int ingredient2, int ingredient3) {
		 if(available||gift) {
		    	return true;
		    }else if(!available&&!gift) {
		    
		    if((ingredient1==1&&ingredient2==2&&ingredient3==3)||(ingredient1==3&&ingredient2==1&&ingredient3==2)) {
		    	return true;
		    }
		    }
			 return false;
		  }       

}	    

