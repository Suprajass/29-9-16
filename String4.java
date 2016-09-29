import java.io.*;
import java.util.*;
public class String4 {
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String str1=in.next();
		Anoth a =new Anoth();
		String s=a.embedWord(str,str1);
		System.out.println(s);
	}
}

