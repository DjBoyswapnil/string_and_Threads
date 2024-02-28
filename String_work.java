package wed_lab;

public class String_work 
{

	public static void main(String[] args) 
	{
		String sb=new String("Welcome to Java World");
		System.out.println(sb.charAt(4));
		System.out.println(sb.equalsIgnoreCase("Welcome"));
		System.out.println(sb.concat(" Let us learn"));
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.replaceAll("a","e"));
		System.out.println(sb.substring(3,9));
		System.out.println(sb.toLowerCase());
	}

}
