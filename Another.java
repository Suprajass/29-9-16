class Another
{
	int n;
	public String missingChar(String s,int n)
	{
			if(n==0)
			{
					return s.substring(1);
			}
			return (s.substring(0,n)+s.substring(n+1));
	}
}
