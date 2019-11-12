package Day029_Lab_4;

public class question_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]x= {1,2,2,3};
		int z=2;
System.out.println(everywhere(x,z));
	}
	public static boolean everywhere(int[]a,int b) {
		 b=2;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b&&a[i+1]==b||a[i+2]==b) {
				return true;
			}
			else {}
			}
		return false;
		}
}
