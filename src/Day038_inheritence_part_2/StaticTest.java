package Day038_inheritence_part_2;

public class StaticTest {

	public static void main(String[] args) {
		StaticSub obj=new StaticSub();
		obj.num=5;
		StaticSuper.num=10;
		obj.print();
		System.out.println(StaticSub.num);
		//StaticSub.m2; you can not call in this way
		obj.m2();//you can call this way

	}

}
