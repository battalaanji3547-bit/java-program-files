class InheritSingle
{
	protected String str;
	InheritSingle(){
		str="java";
	}
}
class SubClass extends InheritSingle
{
	SubClass(){
		str=str.concat("World!!!");
}
void display()
	{
	System.out.println(str);
	}
}
class MainClass{
	public static void main (String args[])
{
		SubClass obj=new SubClass();
		obj.display();
}}