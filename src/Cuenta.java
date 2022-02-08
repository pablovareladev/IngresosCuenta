
public class Cuenta {
	//atributos
	public String titular;
	public double cantidad;


	//constructores
	//constructor vacio
	public Cuenta(){

	}

	public Cuenta (String t, double c) {

		this.titular = t;
		this.cantidad = c;

	}


	//getters y seters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String t) {
		this.titular = t;
	}


	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double c) {
		this.cantidad = c;
	}

	//metodos 
	public void ingresar(double ingreso) {

		if(ingreso > 0) {
			this.cantidad = this.cantidad + ingreso;
		}
	}

	public void retirar (double retirado) {
		if (this.cantidad - retirado <= 0) {
			
			System.out.println("No puede dejar la cuenta en 0");

		}else {
			this.cantidad = this.cantidad - retirado;
		}
	}

}

