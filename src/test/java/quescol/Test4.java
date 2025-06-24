package quescol;

public class Test4
{
	public void run()
	{
		Test5 t = new Test5();
		t.a = 1;

		System.out.println(t.a);
		System.out.println("vaibhav");
	}

	int a;

	public static void main(String[] args)
	{
		Test4 ob = new Test4();

		ob.run();
		ob.a = 10;
		System.out.println(ob.a);
	}

}
