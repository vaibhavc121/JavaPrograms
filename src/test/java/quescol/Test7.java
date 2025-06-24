package quescol;

public class Test7 implements Test6
{
	public void m1()
	{
		System.out.println("m1 function");
	}

	public static void main(String[] args)
	{
		Test6 t6 = new Test7();
		t6.m1();
		Test6.m2();
	}
}
