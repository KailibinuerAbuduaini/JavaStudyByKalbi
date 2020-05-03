package Day014_Method;

public class ValueReturn {

	public static void main(String[] args) {
		
	      double	x= Diatance(180,5);
	      System.out.println(x);
	      
	      if(x>500) {
	    	  System.out.println("you spet to much gas");
	      }else {
	    	  System.out.println("you are ok");
	      }
	}
    public static double Diatance(double speed,double time) {
    	double distance=speed*time;
    	return distance;
    }
}
