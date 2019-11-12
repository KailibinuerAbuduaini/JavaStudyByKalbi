package Day008_controlFlowStatements_Part2;

public class summary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  final String lastName="Smith";
		String firstName="Mike";
		int id=0;
		
		
		switch(firstName) {
		case "Test":
			System.out.println("Test");
			break;
		case lastName:
			id=5;
			break;
		//case 5:
		//break;
		}
		
		int i=0,j=0;
		boolean t=true,r;
		
		r=(t&&0<(i+=1));
		r=(t&&0<(i+=2));
		r=(t||0<(j+=1));
		r=(t||0<(j+=2));
		System.out.println(i+""+j);
		}
	   
	String result;
	int score=88;
	
	int x=5;
	System.out.println(x>2 ? 10:8 : 7);

}
	}
	


