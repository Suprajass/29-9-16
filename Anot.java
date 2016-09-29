public class Anot
{
		String s1;
		public boolean containE(String s1)
		{		int count=0;
				int len=s1.length();
				for(int i=0;i<len;i++)
				{
						if(s1.charAt(i)=='e')
						{
								count++;
						}
				}
				if(count>=1 && count<=3)
				{
					return true;
				}
				else
					return false;
		}
}
