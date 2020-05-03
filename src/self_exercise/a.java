package self_exercise;

public class a {

	public static void main(String[] args) {
		int ApplesCount=20;
	       int OrangesCount=30;
	       int PearsCount=30;
	       boolean comp=ApplesCount<OrangesCount||OrangesCount>=PearsCount;
	       System.out.println(comp);//true

	       
	       
	       int Degree;
	        String OutsideWeather="Shinny";
	        Degree=70;
	        boolean comp2=(!( OutsideWeather=="Rainy"||Degree==70));
	        System.out.println(comp2);
	        
	        
	        int b=2;
	          boolean  res=++b==2||--b==2&&--b==2;
	          //       res=3==2||2==2&&1==2;
	         //        false||true&&false
	         System.out.println(res);
	         
	         
	         
	         
	     	int a=20;
	    	Integer i=Integer.valueOf(a);
	    	
	    	Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
	    	  
	    	System.out.println(a+" "+i+" "+j);  
	    	
	}

	

}
