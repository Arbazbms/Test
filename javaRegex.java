import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BooleanFindMethodExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("^(\\d{3}[- ]?\\d{2}[- ]?)(\\d{4})$");
		Matcher m=p.matcher("456-67-8901");
		int c=0;
		// finding matching char 
		while(m.find())
		{
		c=c+1;
		System.out.println("Start position of matching String "+m.start());
		System.out.println("End position of Matching String (java) "+m.end());
		}
		System.out.println(" Number of matches : "+c);
	}
}
