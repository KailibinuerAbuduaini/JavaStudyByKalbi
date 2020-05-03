import java.util.Arrays;



public class DISCOUNT {

	public static void main(String[] args) {
		//calculate sale price 
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount=regularPrice*0.2;
		salesPrice=regularPrice-discount;
		System.out.println("regular price:$" + regularPrice);
		System.out.println("Discount Amount:$" + discount);
		System.out.println("sales Price:$"+salesPrice);
		
    //parsing value;
		String i="10";
		Integer a=Integer.parseInt(i);
		System.out.println(a+9);
		
		Integer b=Integer.valueOf(i);
		System.out.println(b+5);
		int c=5;
		String d=String.valueOf(c);
		String e=Integer.toString(c);
		System.out.println(d+" "+e);
		
		int[] B= {4,5,7};
		
		System.out.println(Arrays.toString(B));
		
		
		//Array class
		int[] A= {4,5,7,15,2,1,3};
		Arrays.sort(A);
		for(int items:A) {
			System.out.print(items);
		}
		
		
		
		
	}

}
