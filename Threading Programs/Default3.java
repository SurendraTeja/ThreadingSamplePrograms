class Custom1 extends Thread
{
	public void run()
	{
		System.out.println("Custom1 Logic");
	}
}
class Custom2 extends Thread
{
	public void run()
	{
		System.out.println("Custom2 Logic");
	}
}
class Default3
{
	public static void main(String[] argS)
	{
		System.out.println("Default Logic");
		Custom1 th1=new Custom1();
		Custom2 th2=new Custom2();
		th1.start();
		th2.start();
	}
}
		

