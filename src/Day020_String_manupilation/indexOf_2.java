package Day020_String_manupilation;

public class indexOf_2 {

	public static void main(String[] args) {
	
      String list="html-selenium-angular-jenkins-grid";
       //0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,....,34
      int firstDash=list.indexOf("-");
      System.out.println(firstDash);
      
      int secondDash=list.indexOf("-", 5);//(METHOD OVERLOADING)
      System.out.println(secondDash);
      
      int thirDash=list.indexOf("-", secondDash+1);
      System.out.println(thirDash);
      
      int lastDash=list.lastIndexOf("-");
      System.out.println(lastDash);
      
      
      
	}

}
