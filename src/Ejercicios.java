
public class Ejercicios {
	public static void main(String[] args) {
		Ejercicios ejercicios = new Ejercicios();
		ejercicios.ejercicios1();
		System.out.println("---");
		ejercicios.ejercicios2();
		System.out.println("---");
		ejercicios.ejercicios3();
	}
	
	private void ejercicios1()
	{
		int a = 10, b = 20, c = 30;
		System.out.println("Si a = 10, b = 20, c = 30, entonces=>");
		System.out.println("(a + b) > c => " + ((a + b) > c) );
		System.out.println("(a – b) < c => " + ((a - b) < c) );
		System.out.println("(a – b) == c => " + ((a - b) == c) );
		System.out.println("(a * b) != c => " + ((a * b) != c) );
	}
	
	private void ejercicios2()
	{
		System.out.println("Calcular el valor de las siguientes expresiones aritméticas=>");
		System.out.println("21 % 7 => " + (21 % 7));
		System.out.println("9/2+15 % 2 => " + (9/2+15 % 2));
		System.out.println("(3+6)/2+1.5 => " + ((3+6)/2+1.5));
		System.out.println("32/3 - Math.pow(2,2) => " + (32/3 - Math.pow(2,2)));
		System.out.println("2*3+5*6/2*3 => " + (2*3+5*6/2*3));
		System.out.println("Math.pow ( (25-7*3) ,3) / 4 * 5 => " + (Math.pow ( (25-7*3) ,3) / 4 * 5) );
		System.out.println("10+38/(14-(10-12/(2*3))) => " + ( 10+38/(14-(10-12/(2*3)))) );
	}
	
	private void ejercicios3()
	{
		System.out.println("Calcular el resultado de las siguientes expresiones lógicas.");
		System.out.println("! (5>6) && 7<=4 => " + ( ! (5>6) && 7<=4 ));
		System.out.println("7>4 && 5<=5 || 4==5 => " + ( 7>4 && 5<=5 || 4==5 ));
		System.out.println("! (7==7) && (7>=8 || 8==6) => " + ( !(7==7) && (7>=8 || 8==6) ));
		System.out.println("(5+2)<=5 && 3*2==5 or 7<=2*2 or 2*2<=(2+2) => " + ( (5+2)<=5 && 3*2==5 || 7<=2*2 || 2*2<=(2+2) ));
		System.out.println("(! (14/2>8) || 5>5) && (5<=27/3 || 5+3<=3/2) => " + ( (! (14/2>8) || 5>5) && (5<=27/3 || 5+3<=3/2) ));
		System.out.println("(3+5*2)==12/3 && ((5+3)==18/9 || 10/2<=9) || !(9>=2) => " + ( (3+5*2)==12/3 && ((5+3)==18/9 || 10/2<=9) || !(9>=2) ));
	}
}
