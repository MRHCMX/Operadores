
public class Ternario {
	public static void main(String[] args) {
		int x =0;
		int y =1;
		int mayor, numMayor;
		
		if (x>y)
			mayor = x;
		else
			mayor = y;

		numMayor=(x>y)?x:y;
		
		System.out.println(mayor);
		System.out.println(numMayor);
	}
}
