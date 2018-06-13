public class Concrete extends Abstract
{
	public void area()
	{
		System.out.println("Stactic Method overridden in child class");
	}
	void printData(int a, double d)
	{
		System.out.println("Member of child class which define integer "+a+" and double vale "+d);
	}
	public static void main(String args[ ])
	{
		Concrete con=new Concrete();
		con.area();
		con.msg();
		con.printData(10,15.5);
	}
}