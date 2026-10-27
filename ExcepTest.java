class ExcepTest
{
	public static void main(String[]args)
	{
		int a[]=new int[2];
		System.out.println("out of try");
		try
		{
			// System.out.println("acess invalid elements"+a[3]);
			/*the above statement will throw ArrayIndexOutOfBoundsException*/
		}
		finally
		{
			System.out.println ("finally is always excuted.");
		}
}
}