import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//declaramos variables
		String nombre ="";
		double dinero = 0;
		
		
		//pedimos al usuario valores
		System.out.println("nombre");
		nombre = teclado.next();
		
		System.out.println("dinero");
		dinero = teclado.nextDouble();
		
		//hacemos que c1 sea una nueva instancia de la clase Cuenta
		Cuenta c1 = new Cuenta(nombre, dinero );
		
		//ingresamos 20 de dinero
		c1.ingresar(20);
		//mostramos por consola 
		System.out.println(c1.getCantidad());
		
		System.out.println("se ha ingresado dinero");
		
		//retiramos dinero
		c1.retirar(10);
		//mostramos por consola 
		System.out.println(c1.getCantidad());
		System.out.println("se ha retirado dinero");
		
		
		
		
		
		
		
		
		
	}

}
