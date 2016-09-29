public class Ano
{
	String s1;
	public String backAround(String s1)
	{
		int n=s1.length();
		String s2=s1.substring(n-1);
		return (s2+s1+s2);
	}
}
