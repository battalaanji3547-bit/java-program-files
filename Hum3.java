class human
{
	double height;
	double weight;
	double age;
	void feature()
{
		System.out.println("ratio is:");
		System.out.println(weight /height);
		System.out.println("age is:"+age);
}
}
class Hum3
{
	public static void main(String args[])
{
		human h1=new human();
		human h2=new human();
		h1.height=5.6;
		h1.weight=67;
		h1.age=36;
		h2.height=5.5;
		h2.weight=39;
		h2.age=39;
		h1.feature();
		h2.feature();
}
}