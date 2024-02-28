package wed_lab;

public class String_buffer_demo 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("This is StringBuffer");
		System.out.println(sb.append(" This is a sample program"));
		System.out.println(sb.insert(20, " Object"));
		System.out.println(sb.reverse());
		System.out.println(sb.replace(14, 19, "Builder"));
	}

}
