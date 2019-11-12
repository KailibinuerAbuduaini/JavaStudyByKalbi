package Day017_class_object;

public class Capital_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bank_account acc1=new Bank_account();
      acc1.accountHolder="kelly Abdu";
      acc1.accountNumber=12345;
      acc1.deposit(3000);
      acc1.showBalance();
      acc1.withdraw(200);
      acc1.charge(116, "monitor");
	}

}
