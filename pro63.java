package guvi;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class pro63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		Set<Character>repeated=new LinkedHashSet<Character>();
		for(char c:s1.toCharArray())
		{
			repeated.add(c);
		
		System.out.println(repeated.size());
		}
	}
	}
