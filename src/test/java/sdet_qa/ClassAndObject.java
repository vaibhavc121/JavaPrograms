package sdet_qa;

public class ClassAndObject
{
	int id;
	String name;
	String job;
	int sal;

	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args)
	{
		ClassAndObject emp1 = new ClassAndObject();
		emp1.id = 1;
		emp1.name = "vaibhav";
		emp1.job = "SE";
		emp1.sal = 1;

		emp1.display();

		System.out.println(emp1.id);

	}

}
