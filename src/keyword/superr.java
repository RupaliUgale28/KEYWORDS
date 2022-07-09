package keyword;
class parent
{
	int a=20;//first use
	public void p1()//second use
	{
		System.out.println("hi from pune");
	}
	//third use
	parent(int d)//constructor 1
	{
		System.out.println("input constructor");
	}	
}

public class superr extends parent
{
	public void m1(int a)
	{
		int c=a+super.a;
		System.out.println(c);
		System.out.println(super.a);//first use
		super.p1();//second use
		
	}
	superr()//constructor 2
	{
		super(10);//third use
		System.out.println("from parent ");
	}
	
	public static void main(String[] args) 
	{
		superr s=new superr();
		s.m1(60);
		
	}

}
