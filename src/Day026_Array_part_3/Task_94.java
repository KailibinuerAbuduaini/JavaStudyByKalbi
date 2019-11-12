package Day026_Array_part_3;

public class Task_94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

String[] Array1= info1.split("xxx");
String[] Array2= info2.split("xxx");

String password1=Array1[1];
String password2=Array2[1];
System.out.println("Password : " + password1+password2);


//System.out.println(arr[8].substring(3,9).concat(arr2[8].substring(3,9)));

	}

}
