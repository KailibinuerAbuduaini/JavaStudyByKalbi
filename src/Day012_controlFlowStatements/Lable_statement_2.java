package Day012_controlFlowStatements;

public class Lable_statement_2 {

	public static void main(String[] args) {
		
		int i=0;
		outer:
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if(i==4) {
							break outer;
						}
					}
			}while(true);
	}

}
