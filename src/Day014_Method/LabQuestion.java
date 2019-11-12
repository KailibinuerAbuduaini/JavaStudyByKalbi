package Day014_Method;

public class LabQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cigarParty(20,false);
		deerPlay(95,false);
		love6(3,1);
		specialEleven(45);
		stringTimes("Hi",2);
		caughtSpeeding(65,true);
   }

		public static void cigarParty(int numberCigar,boolean isWekeend) {
			
			if(isWekeend) {
				if(numberCigar<h40) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
			}else {
				if(numberCigar>=40 && numberCigar<=60) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}

			}
			}
	public static void deerPlay(int temp,boolean isSummer)	{
//		if (t>=60&&t<=90&&summer==false) {
//			System.out.println(true);
//		}else if (t<=100&&summer==true) {
//			System.out.println(true);
		if(isSummer) {
			if(temp>60 && temp<100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(temp>60 && temp<90) {
				System.out.println(true);
			}else {
				System.out.println(false);
		}
	}
	}
	public static void love6(int x,int y) {
		if (x==6||y==6||x+y==6||x-y==6||y-x==0) {
			System.out.println(true);
		
		}else {
			System.out.println(false);
		}
	}
	public static void specialEleven(int num) {
		if(num%11==0||(num-1)%11==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	public static void stringTimes(String h,int z) {
		String str="";
		for(int i=0;i<z;i++) {
			
			str=str+h;
		}
		System.out.println(str);
	}
	
	public static void caughtSpeeding(int speed,boolean isBirthday) {
		
		if(isBirthday) {
			if(speed<=65) {
				System.out.println(0);
			}else if(speed>=66 && speed <=85) {
				System.out.println(1);
			}else if(speed>=86) {
				System.out.println(2);
			}
		}else {
			if(speed<=60) {
				System.out.println(0);
			}else if(speed>=61 && speed <=80) {
				System.out.println(1);
			}else if(speed>=81) {
				System.out.println(2);
			}
		}
	}
	}

