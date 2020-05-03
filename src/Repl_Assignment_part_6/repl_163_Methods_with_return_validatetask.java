package Repl_Assignment_part_6;

public class repl_163_Methods_with_return_validatetask {

	public static void main(String[] args) {
		
System.out.println(validateTask(false,3,2));
	}
	public static boolean validateTask(boolean notEmpty,int taskId,int currentId)
	  {
	     for(int i=0;i<=taskId;i++) {
	    	 if(notEmpty==true&&taskId==i&&currentId==i-1) {
	    		 return true;
	    	 }else if(notEmpty==true&&taskId==i&&currentId==i-2) {
	    		 return false;
	    		 
	    	 }else if(notEmpty==false&&taskId==i&&currentId==i-1) {
	    		
	    	 }
	     }
	
	     return false;
	  }
}
