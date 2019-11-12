package Day027_two_dimentional_array;

public class question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]x= {1,2,3};
int[]y= {7,3};
find(x,y);
System.out.println("samelast");
	}
public static String find(int[]arr,int[]Arr) {
	if(arr.length>1&&Arr.length>1) {
		if(arr[0] == Arr[Arr.length-1])
		{
			return "true";
		 }else {
			 return"false";
		 }
	}
	return null;
}
}
