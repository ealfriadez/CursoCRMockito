package pe.edu.unfv.calculate;

public class Calculadora {

	ICalculadoraGoogle iCalculadoraGoogle;
	
	public int sumaGoogle(int a, int b) {
		
		return iCalculadoraGoogle.sumar(a, b);
	}
}
