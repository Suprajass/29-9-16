import java.util.*;
import java.io.*;
public class String1 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		String str=in.next();
		Another a=new Another();
		String str1=a.missingChar(str,n);
		System.out.println(str1);	
	}
}

