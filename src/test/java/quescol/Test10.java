package quescol;

public class Test10 extends Test9
{

	@Override
	public void m9()
	{
		System.out.println("imp of m9");
	}

	public static void main(String[] args)
	{
		Test10 t10 = new Test10();
		t10.m9();
		t10.m99();
	}

}
