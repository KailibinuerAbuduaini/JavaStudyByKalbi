package Day009_controlFlowStatements_Part3;

public class task39_trafficLightSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char color='r';
		
		switch(color) {
		case 'R':case 'r':
			System.out.println("Red Light");
			break;
		case 'O':case 'o':
			System.out.println("Orange Light");
			break;
		case 'G':case 'g':
			System.out.println("Green Light");
			break;
		default:
			System.out.println("Invalid Light");
				
		}

	}

}
