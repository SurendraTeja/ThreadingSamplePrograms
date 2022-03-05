class Custom extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("Custom is :"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}
class ThreadProgramWithSettingInterval
{
	public static void main(String[] args)
	{
		Custom th=new Custom();
				th.start();
		for(int i=1;i<=20;i++)
		{
			System.out.println("Default is :"+i);
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
			}
		}
	}
}