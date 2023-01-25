
public class Cuadrado {
	
	public int lado ;
	public double longitud;

	public int area () {
		return lado * lado;
	}
	public int perimetro () {
		return lado*4;
	}
	public double diagonal () { 
		return longitud = Math.sqrt(Math.pow(lado, 2)+ Math.pow(lado, 2));
	}
	public int camabiaLado (int lado) {
		return this.lado = lado;
	}
	Cuadrado () {
		this(177808);
	}
	Cuadrado(int lado) {
		this.lado = lado;
	}

}
