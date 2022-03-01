
public class Incremental {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		while (a < 11)
		{
			c = c + 1;
			System.out.println(a++ + ", " + ++b + ", " + c);
		}
	}
}
