package Day007_controlflow_statements;

public class smallTasks {

	public static void main(String[] args) {
       int x,y;
       x=5;
       y=20;
       if(y==20)
    	   x=5;
    	   
       {System.out.println("right");
    	   
       }
       
       double payrate=60*1.5;
       if (payrate>40) {
    	   System.out.println("good");
       }
       
       int temp=75;
       if(temp<80||temp>70) {
    	   System.out.println("excelent");
    	   
    	   int age=30;
    	   if (age>=18) {
    		   System.out.println("you are eligible to vote");
    	   }
    	   int a,b,c;
    	   a=999;
    	   b=500;
    	   c=234;
    	  
    	  if(a>b&&b>c) {
    		  System.out.println("a is greatest");
    		  
    	  }
    	  if(b>a&&b>c) {
    		  System.out.println("b is greatest");
    		  
    	  }
    	  if(c>a&&c>b) {
    		  System.out.println("c is greatest");
    	  }
    	  int d=112;
          int k=879;
          if(d==k) {
     	   System.out.println("wrong");
        }
        if(d!=k) {
     	   System.out.println("right");
        }
       }
     
       double hour=7.00;
  
       if (hour>5||hour<12) {
    	   System.out.println("morning");
       }
       if(hour>12||hour<18) {
    	   System.out.println("afternoon");
       }
       if(hour>18||hour>24){
    	   System.out.println("evening");
       }
       
       double price = 100;
		int quantity =  2000;
		
		double revenue;
		double discount=0;
		
		revenue=price*quantity;
		
		if(revenue>5000) {
			
			discount = revenue*0.1;
			revenue=revenue-discount;
		}
		
		System.out.println("discount = " + discount);

	}  
         
	}

