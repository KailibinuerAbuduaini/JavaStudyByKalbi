package Day016_class_object;

public class CellPhone_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone cellPhone1=new CellPhone();
		cellPhone1.brand="Apple";
	
		cellPhone1.price=1300;
		cellPhone1.color="red";
		cellPhone1.call();
		cellPhone1.message();
		cellPhone1.takeAphoto();
		
	}

}
