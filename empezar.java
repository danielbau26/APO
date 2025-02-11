public class empezar{

	public static void main (String[] args){

		Test test = new Test();
		System.out.println("Area: " + test.calcularAreaCirculo(radio:5));

	}
	
	public double calcularAreaCirculo (double radio){

		return 2*Math.PI*radio;
	}
}