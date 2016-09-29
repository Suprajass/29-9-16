import java.util.*;
import java.io.*;
public class String5 {
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String str1=in.next();
		Anothe a =new Anothe();
		String s=a.makeTags(str,str1);
		System.out.println(s);
	}
}

