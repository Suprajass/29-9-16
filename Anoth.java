public class Anoth{
		String s1,s2;
		public String embedWord(String s1,String s2)
		{
				int n=s1.length();
				String s3=s1.substring(0,(n/2))+s2+s1.substring((n/2));
				return s3;
		}
}
