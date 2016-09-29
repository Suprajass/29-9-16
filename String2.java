import java.util.*;
import java.io.*;
public class String2 {
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		Ano a =new Ano();
		String s=a.backAround(str);
		System.out.println(s);
		
	}
}

