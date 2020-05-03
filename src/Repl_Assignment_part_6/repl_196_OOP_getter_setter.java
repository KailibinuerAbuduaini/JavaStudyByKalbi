package Repl_Assignment_part_6;

public class repl_196_OOP_getter_setter {

	public static void main(String[] args) {
		Db db = new Db();
		db.insertData("aaa",123);
		System.out.println(db.getData());//aaa
		 System.out.println(db.getYint());//123
		 
		 db.setData("zzz");
		 db.setYint(200);
		 
		 System.out.println(db.getData());//zzz
		 System.out.println(db.getYint());//200

	}

}
