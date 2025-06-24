package quescol;

public class Test15 implements Test13, Test14
{

	@Override
	public void m1()
	{
		System.out.println("m1 implementation");
	}

	public static void main(String[] args)
	{
		Test13 t14 = new Test15();
		t14.m1();
	}

}
