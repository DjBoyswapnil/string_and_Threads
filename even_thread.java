package wed_lab;

public class even_thread extends Thread
 {
	public void run() 
	{
		for(int i=1;i<100;i++)
		{
			if(i%2==0)
			{
				System.out.println("the even no="+i);
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		even_thread sob=new even_thread();
		sob.start();
		sob.join();
		odd_thread sob2=new odd_thread();
		sob2.start();
	}
 }
 class odd_thread extends Thread
{

	public void run() 
	{
		for(int i=1;i<100;i++)
		{
			if(i%2!=0)
			{
				System.out.println("the odd no="+i);
			}
		}
	}	
	

}

