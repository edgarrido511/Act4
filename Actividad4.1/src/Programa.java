import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que figura quiere ");
		String seleccion;
		int c;
		seleccion  = entrada.nextLine();
		Cuadrado a = new Cuadrado();
		Circulo b = new Circulo();
		
		if (seleccion.contains ("cuadrado") ) {
			System.out.println("Que largo desea que tenga el lado del cuadrado)");
			seleccion = entrada.nextLine();
			c = Integer.parseInt(seleccion);
			a.camabiaLado(c);
			System.out.println("Que desa calcular? area, perimetro, diagonal");
			seleccion = entrada.nextLine();
			if(seleccion.contains("area")) {
				System.out.println(a.area());
			}
			if(seleccion.contains("perimetro")) {
				System.out.println(a.perimetro());
			}
			if(seleccion.contains("diagonal")) {
				System.out.println(a.diagonal());
			}
		}
		if (seleccion.contains("circulo")) {
			System.out.println("Que largo desea que tenga el radio del circulo");
			seleccion = entrada.nextLine();
			c = Integer.parseInt(seleccion);
			b.cambiaRadio(c);
			System.out.println("Que desa calcular? area o circunferencia");
			seleccion = entrada.nextLine();
			if(seleccion.contains("area")){
				System.out.println(b.area());
			}
			if (seleccion.contains("circunferencia")) {
				System.out.println(b.circunferencia());
			}
		}
		entrada.close();
	}

}