package self_exercise;

public class collage {
	String name;
	int ID;
	static String university="Camerino";
	
 public void study() {
	 System.out.println(name+" study in "+university+"  ,student ID is "+ID);
 }

	
	public collage(String name, int iD) {
		
		this.name = name;
		ID = iD;
	}



	public static void main(String[] args) {
		
		
		
		collage s1=new collage("kelly", 333777);
		
		s1.study();
		
		collage s2=new collage("guzal", 256337);
		collage.university="milan";
		s2.study();
}
}