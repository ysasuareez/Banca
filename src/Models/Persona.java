package Models;

import java.util.ArrayList;

public class Persona {

	// Propiedades

	public String nombre;
	public String apellido;
	public String dni;
	public double sueldo;
	public CuentaCorriente cuentaC;

	public ArrayList<CuentaCorriente> cuentascorrientes = new ArrayList <CuentaCorriente>(); 
	
	
	// constructor

	public Persona(String nombre, String apellido, String dni, double sueldo, CuentaCorriente CuentaC) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldo = sueldo;
		this.cuentaC = CuentaC;
	}

	// getters and setters



	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setCuentaCorriente(CuentaCorriente c) {
		this.cuentaC = c;
	}

	public CuentaCorriente getCuentaCorriente() {
		return cuentaC;
	}

	// metodo

	public void cambiarsueldo(int cantidad) {
		this.sueldo += cantidad;
	}
	
	public void cobrarSueldo() {
		double saldo_cuenta = cuentaC.getSaldo();

		double nuevo_saldo = saldo_cuenta + sueldo; 
		
		cuentaC.setSaldo(nuevo_saldo); 
	}
	
	public void sacarPasta(double cantidad) {
		double saldo_cuenta = cuentaC.getSaldo();

		if(saldo_cuenta >= cantidad) {
			double nuevo_saldo = saldo_cuenta - cantidad;
			cuentaC.setSaldo(nuevo_saldo);
		}else {
			System.out.println("No tienes suficiente passsshta.");
		}		
	}
	
	public void cambiarSueldo(double cantidad) {
		sueldo = cantidad;
	}

	// toString

	@Override
	public String toString() {
		String resultado = "";
		
		resultado =nombre + " " + apellido + ", " + dni + ". Sueldo: " + sueldo + ". Cuenta Corriente: "
				+ cuentaC.getNumeroCuenta() + ". Saldo: " + cuentaC.getSaldo();
		
		return resultado;  
	}

}
