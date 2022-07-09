package keyword;
public class thiss {
	int a=20;
	public void m1(int a)//method 1
	{
		//first use= calling current class instance variable
		int c=a+this.a;//here this.a =is a instance variable and only 'a' is local variable
		System.out.println(c);
	}
	public void m2()//method 2
	{
		//second use= calling current class method
		this.m1(30);
		System.out.println("Hello INDIA");
	}
	
	//Third use= use to invoke current class constructor
	thiss()//constructor 1
	{
		this(10);//this keyword is must...not a name of constructor//third use
		System.out.println("I am no prameterised constructor");
	}
	thiss(int d)
	{
		System.out.println("I am prameterised constructor");
	}
	public static void main(String[] args) 
	{
		thiss t=new thiss();//automatically calls no parameter constructor here i.e. first constructor
		//first use
	//	t.m1(10);//m1 method calling
		System.out.println(t.a);//instance variable

		//second use
		t.m2();
		
		//third use
	}

}
