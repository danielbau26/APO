import java.util.Scanner;

public class Segundo{

	public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite el número del radio: ");
        double radio = in.nextDouble();

		Segundo uno = new Segundo();

        in.close();

		System.out.println("Area: " + uno.AreaCirculo(radio));
        System.out.println("Volumen: " + uno.VolumenCirculo(radio));

	}
	
	public double AreaCirculo (double radio){

		return 2*Math.PI*radio;
	}

    public double VolumenCirculo (double radio){

        return (4/3)*Math.PI*Math.pow(radio,3);

    }
}