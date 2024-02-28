package wed_lab;
class arry_square extends Thread
{
	public void run()
	{
		int arr[]= {1,20,50,15,30};
		for(int i=1;i<arr.length;i++)
		{
			System.out.println("square of array"+arr[i]*arr[i]);
		}
	}
}
public class thread_schadule extends Thread 
{	
	int sum=0,average;
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;	
		}
		average=sum/10;
		double s=average;
		System.out.println("the average value is="+s);
	}
	public static void main(String[] args)
	{
		thread_schadule obj=new thread_schadule();
		obj.start();
		arry_square obj2=new arry_square();
		obj2.start();
	}
}
