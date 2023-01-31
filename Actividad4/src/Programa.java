import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Cuadrado a = new Cuadrado();
		Circulo b = new Circulo();
		while (true) {
			System.out.println("Para cuadrado escoge 1, para Circulo 2 y para salir 3");
			int seleccion  = entrada.nextInt();
			switch(seleccion) {
			case 1:
			System.out.println("Que largo dedasea que tenga el lado");
			seleccion = entrada.nextInt();
			a.camabiaLado(seleccion);
			System.out.println("Que desea calcular? area(1), perimetro(2), diagonal(3)");
			seleccion = entrada.nextInt();
			switch (seleccion) {
				case 1:
				System.out.println(a.area());
				break;
				case 2:
				System.out.println(a.perimetro());
				break;
				case 3:
				System.out.println(a.diagonal());
				break;
			}
			break;
			case 2:
			System.out.println("Que largo desea que tenga el radio?");
			seleccion = entrada.nextInt();
			b.cambiaRadio(seleccion);
			System.out.println("Que desea calcular? area(1) o circunferencia(2)");
			seleccion = entrada.nextInt();
			switch (seleccion) {
				case 1:
				System.out.println(b.area());
				break;
				case 2:
				System.out.println(b.circunferencia());
				break;
			}
			break;
			case 3:
			System.out.println("Saliendo...");
			System.exit(0);
			break;
		  }
	  }
	}
}
