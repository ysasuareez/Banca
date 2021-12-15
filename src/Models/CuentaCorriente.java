package Models;

public class CuentaCorriente {

	//prop
	
	private int numeroCuenta;
	private double saldo;
	private Persona titular;
	
	//costr

	public CuentaCorriente(int numeroCuenta, double saldo, Persona titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}


	
	
	// gett sett

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}




	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




	public void setTitular(Persona titular) {
		this.titular = titular;
	}




	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Persona getTitular() {
		return titular;
	
	}
	
	
	//metodos
	
	public void sumarCantidad(double cantidad) {
		this.saldo += cantidad;
	}
	
	public void restarCantidad(double cantidad) {
		if(this.saldo <= cantidad) {
			this.saldo -= cantidad;
		}else {
			System.out.println("No tienes suficiente passsshta.");
		}
		
	}
	
	
	//toString
	
	@Override
	public String toString() {
		return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
}