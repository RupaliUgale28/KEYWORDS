package keyword;
//third use with class
//final class parent1// can't inherit the final class
class parent1
{
	//Second use with method
	//final public void p1()//can't inherit or override final method
	 public void p1()
	 {
		 System.out.println("from parent");
	 }
}

public class finall extends parent1 {
	
	public void p1()
	{
		System.out.println("from child main");
	}

	public static void main(String[] args) {
		//first use with variable
		final int a=10;
		int b=20;
	//	a=a+b;//complilation error= we ncan't change the value of final variable
		
		finall f=new finall();
		f.p1();
	}

}
