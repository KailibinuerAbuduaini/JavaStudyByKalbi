package KalbiTask1;

public class w_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JavaScript";
		System.out.println(getMsg(str));

		
		String w="minimum";
		System.out.println(w.substring(4, 7));
		System.out.println(w.substring(w.indexOf('n')));
	}

	public static String getMsg(String x) {
	String msg="Input value must be ";
	msg=msg.concat("smaller than x");
	msg.replace("x",x);
	String rest=" and larger than 0";
	msg.concat(rest);
	return msg;
	}
	
	
}
