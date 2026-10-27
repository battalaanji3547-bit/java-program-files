public class NumberObjects
{
	static int count=0;
	NumberObjects()
{
		count++;
}
public static void main(String[]args)
	{
	NumberObjects obj1=new NumberObjects();
	NumberObjects obj2=new NumberObjects();
	NumberObjects obj3=new NumberObjects();
	NumberObjects obj4=new NumberObjects();
	System.out.println("Number of objects created:"+count);
	}
}