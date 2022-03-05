class Custom
{
	void numbers()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("Custom is :"+i);
		}
	}
}
class Default
{
	public static void main(String[] args)
	{
		Custom obj=new Custom();
				obj.numbers();
		for(int i=1;i<=20;i++)
		{
			System.out.println("Default is :"+i);
		}
	}
}