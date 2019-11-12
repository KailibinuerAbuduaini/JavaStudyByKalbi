package Day032_ArrayList_part_2;

import java.util.ArrayList;
import java.util.Random;

public class custom_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(10);
		numList.add(1);
		numList.add(11);
		numList.add(80);
		numList.add(340);
		numList.add(117);
		
		 printList(numList);
		 
		 ArrayList<Double> doubleList = new ArrayList<>();
         doubleList.add(10.33);
         doubleList.add(5.33);
         doubleList.add(7.33);
         
         double sum=sumList(doubleList);
         System.out.println(Math.round(sum));
         
         ArrayList<Integer> List =getList(15);// ongxang miyeni
         System.out.println(List.toString());
         
         ArrayList<Integer> rList = getRandomList(20);
         System.out.println(rList.toString());
         
         
         ArrayList<String>  strnums= new ArrayList<>();
         strnums.add("123");
         strnums.add("13");
         strnums.add("13");
         strnums.add("33");
         System.out.println(strnums);
         ArrayList<Integer> coverted=convertToIntList(strnums);
         System.out.println(coverted);
         
         
         
	}		
	
public static void printList(ArrayList<Integer> num) {
	
	for(int n:num) {
		System.out.println(n+"");
	}
	
}



public static double sumList(ArrayList<Double>nums) {
	double sum=0;
	for(Double n:nums) {
		
		sum=sum+n;
	}
	return sum;
}
public static ArrayList<Integer>  getList(int n) {
	ArrayList<Integer> newList=new ArrayList<>();
	for(int i=0;i<=n;i++) {
	newList.add(i);
	}
	return newList;
}

public static ArrayList<Integer> getRandomList(int size){
	Random r=new Random(100);
	ArrayList<Integer> randomNums=new ArrayList<>();
	for(int i=1;i<=size;i++) {
		randomNums.add(r.nextInt(101));
	}
	return randomNums;
}
public static ArrayList<Integer> convertToIntList(ArrayList<String>  a){
	ArrayList<Integer> newList=new ArrayList<>();
	for(String str:a) {
	newList.add(Integer.parseInt(str));
}
return newList;
}
}