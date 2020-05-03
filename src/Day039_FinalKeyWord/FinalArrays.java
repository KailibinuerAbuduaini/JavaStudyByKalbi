package Day039_FinalKeyWord;

public class FinalArrays {

	public static void main(String[] args) {
		final int[] Team= {11,12};
		System.out.println(Team[0]);
		System.out.println(Team[1]);
		Team[0]=10;
		Team[1]=9;
		System.out.println(Team[0]);
		System.out.println(Team[1]);
		
		int[] nums= {23,55,3456};// these two are different in the heap
		nums=new int[] {23,33,66,27};
		
		final int[] finalnums= {778,3452,9009};
		finalnums[0]=120;
		finalnums[1]=120;
		finalnums=new int[] {1,2,3,4};
		
		
	}

}
