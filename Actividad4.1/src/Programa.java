import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Para cuadrado escoge 1 y para Circulo 2");
		int seleccion  = entrada.nextInt();
		Cuadrado a = new Cuadrado();
		Circulo b = new Circulo();
		
		if (seleccion == 1) {
			System.out.println("Que largo desea que tenga el lado del cuadrado)");
			seleccion = entrada.nextInt();
			a.camabiaLado(seleccion);
			System.out.println("Que desa calcular? area(1),perimetro(2),diagonal(3)");
			seleccion = entrada.nextInt();
			if(seleccion == 1) {
				System.out.println(a.area());
			}
			if(seleccion == 2) {
				System.out.println(a.perimetro());
			}
			if(seleccion ==3) {
				System.out.println(a.diagonal());
			}
		}
		if (seleccion == 2) {
			System.out.println("Que largo desea que tenga el radio del circulo");
			seleccion = entrada.nextInt();
			b.cambiaRadio(seleccion);
			System.out.println("Que desa calcular? area(1),circunferencia(2),");
			seleccion = entrada.nextInt();
			if(seleccion == 1){
				System.out.println(b.area());
			}
			if (seleccion == 2) {
				System.out.println(b.circunferencia());
			}
		}
		
		//entrada.close();

	}

}
